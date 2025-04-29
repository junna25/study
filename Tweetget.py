import streamlit as st
import requests
import pandas as pd
import datetime
import base64
import json

# アプリのタイトルと説明
st.set_page_config(page_title="Twitter/X ツイート取得アプリ", layout="wide")
st.title("Twitter/X ユーザーツイート取得アプリ")
st.write("特定のTwitter/Xユーザーのツイートを取得してCSVでダウンロードできます")

# サイドバーにAPIキー入力フォームを設置
st.sidebar.header("Twitter/X API v2 認証情報")
bearer_token = st.sidebar.text_input("Bearer Token", type="password")

def get_user_id(username, bearer_token):
    """ユーザー名からユーザーIDを取得する関数"""
    url = f"https://api.twitter.com/2/users/by/username/{username}"
    headers = {"Authorization": f"Bearer {bearer_token}"}
    
    try:
        response = requests.get(url, headers=headers)
        if response.status_code != 200:
            st.error(f"ユーザー情報取得エラー (ステータスコード: {response.status_code})")
            st.error(f"エラー詳細: {response.text}")
            return None
        
        data = response.json()
        if 'data' not in data:
            st.error("ユーザーが見つかりませんでした")
            return None
            
        return data['data']['id']
    except Exception as e:
        st.error(f"エラーが発生しました: {e}")
        return None

def get_user_tweets(user_id, bearer_token, max_results=10, include_rts=False):
    """特定のユーザーのツイートを取得する関数 (API v2)"""
    url = f"https://api.twitter.com/2/users/{user_id}/tweets"
    
    # APIに渡すパラメータ
    params = {
        "max_results": max_results,
        "tweet.fields": "created_at,public_metrics,source,entities",
        "exclude": "retweets" if not include_rts else ""
    }
    
    headers = {"Authorization": f"Bearer {bearer_token}"}
    
    try:
        response = requests.get(url, headers=headers, params=params)
        if response.status_code != 200:
            st.error(f"ツイート取得エラー (ステータスコード: {response.status_code})")
            st.error(f"エラー詳細: {response.text}")
            return None
        
        data = response.json()
        
        if 'data' not in data:
            if 'errors' in data:
                for error in data['errors']:
                    st.error(f"API エラー: {error.get('message', '不明なエラー')}")
            else:
                st.warning("ツイートが見つかりませんでした")
            return pd.DataFrame()
        
        tweets = data['data']
        tweet_data = []
        
        for tweet in tweets:
            # ツイートデータを辞書形式で保存
            tweet_info = {
                'id': tweet['id'],
                'created_at': tweet['created_at'],
                'text': tweet['text'],
                'like_count': tweet['public_metrics']['like_count'],
                'retweet_count': tweet['public_metrics']['retweet_count'],
                'reply_count': tweet['public_metrics']['reply_count'],
                'quote_count': tweet['public_metrics']['quote_count'],
                'source': tweet.get('source', 'Unknown')
            }
            
            # ハッシュタグがあれば追加
            if 'entities' in tweet and 'hashtags' in tweet['entities']:
                hashtags = [tag['tag'] for tag in tweet['entities']['hashtags']]
                tweet_info['hashtags'] = ', '.join(hashtags) if hashtags else ''
            
            tweet_data.append(tweet_info)
        
        # データフレームに変換
        df = pd.DataFrame(tweet_data)
        
        # 日時をより読みやすい形式に変換
        if 'created_at' in df.columns:
            df['created_at'] = pd.to_datetime(df['created_at']).dt.strftime('%Y-%m-%d %H:%M:%S')
        
        return df
    
    except Exception as e:
        st.error(f"エラーが発生しました: {e}")
        import traceback
        st.error(traceback.format_exc())
        return None

def get_user_profile(username, bearer_token):
    """ユーザープロフィール情報を取得する関数"""
    url = f"https://api.twitter.com/2/users/by/username/{username}"
    params = {
        "user.fields": "profile_image_url,description,public_metrics,created_at,location,verified"
    }
    headers = {"Authorization": f"Bearer {bearer_token}"}
    
    try:
        response = requests.get(url, headers=headers, params=params)
        if response.status_code != 200:
            return None
        
        data = response.json()
        if 'data' not in data:
            return None
            
        return data['data']
    except:
        return None

def get_csv_download_link(df, username):
    """DataFrameをCSVに変換してダウンロードリンクを生成する関数"""
    csv = df.to_csv(index=False)
    b64 = base64.b64encode(csv.encode()).decode()
    now = datetime.datetime.now().strftime("%Y%m%d_%H%M%S")
    filename = f"{username}_tweets_{now}.csv"
    href = f'<a href="data:file/csv;base64,{b64}" download="{filename}" class="download-button">CSVファイルをダウンロード</a>'
    return href

# カスタムCSSを追加
st.markdown("""
<style>
.download-button {
    display: inline-block;
    padding: 0.5rem 1rem;
    background-color: #000000;
    color: white;
    text-align: center;
    text-decoration: none;
    font-size: 16px;
    border-radius: 4px;
    transition: background-color 0.3s;
}
.download-button:hover {
    background-color: #004d00;
}
.user-profile {
    display: flex;
    align-items: center;
    margin-bottom: 1rem;
    padding: 1rem;
    border-radius: 10px;
    background-color: #bbbcde;
}
.profile-image {
    border-radius: 50%;
    margin-right: 1rem;
}
.profile-info {
    flex: 1;
}
.metric-container {
    display: flex;
    justify-content: space-between;
    margin-top: 0.5rem;
}
.metric {
    text-align: center;
    padding: 0.5rem;
    background-color: #666666;
    border-radius: 5px;
    flex: 1;
    margin: 0 0.25rem;
}
</style>
""", unsafe_allow_html=True)

# メインフォーム
col1, col2 = st.columns([2, 1])

with col1:
    st.header("ユーザーツイート取得")
    username = st.text_input("ツイートを取得するユーザー名を入力してください (@は不要):")
    
    col_count, col_rts = st.columns(2)
    with col_count:
        count = st.slider("取得するツイート数", 5, 100, 20)
    with col_rts:
        include_rts = st.checkbox("リツイートを含める")

with col2:
    st.header("APIテスト")
    if st.button("API接続テスト"):
        if not bearer_token:
            st.warning("Bearer Tokenを入力してください")
        else:
            with st.spinner("API接続を確認中..."):
                # 公式Twitterアカウントでテスト
                test_user = "Twitter"
                url = f"https://api.twitter.com/2/users/by/username/{test_user}"
                headers = {"Authorization": f"Bearer {bearer_token}"}
                
                try:
                    response = requests.get(url, headers=headers)
                    if response.status_code == 200:
                        st.success(f"API接続成功！(ステータスコード: {response.status_code})")
                        st.json(response.json())
                    else:
                        st.error(f"API接続エラー (ステータスコード: {response.status_code})")
                        st.error(response.text)
                except Exception as e:
                    st.error(f"エラーが発生しました: {e}")

# ツイート取得実行ボタン
if st.button("ツイートを取得", key="get_tweets"):
    if not username:
        st.warning("ユーザー名を入力してください")
    elif not bearer_token:
        st.warning("Bearer Tokenを入力してください")
    else:
        with st.spinner("ユーザー情報とツイートを取得中..."):
            # ユーザー情報を取得
            user_profile = get_user_profile(username, bearer_token)
            
            # ユーザーIDを取得
            user_id = get_user_id(username, bearer_token)
            
            if user_id:
                # ユーザープロフィールを表示
                if user_profile:
                    st.subheader("ユーザープロフィール")
                    
                    profile_html = f"""
                    <div class="user-profile">
                        <img src="{user_profile.get('profile_image_url', '')}" alt="Profile Image" width="64" height="64" class="profile-image">
                        <div class="profile-info">
                            <h3>{user_profile.get('name', username)}</h3>
                            <p>@{user_profile.get('username', username)}</p>
                            <p>{user_profile.get('description', '')}</p>
                            <div class="metric-container">
                                <div class="metric">
                                    <strong>フォロワー</strong><br>
                                    {user_profile.get('public_metrics', {}).get('followers_count', 0):,}
                                </div>
                                <div class="metric">
                                    <strong>フォロー</strong><br>
                                    {user_profile.get('public_metrics', {}).get('following_count', 0):,}
                                </div>
                                <div class="metric">
                                    <strong>ツイート数</strong><br>
                                    {user_profile.get('public_metrics', {}).get('tweet_count', 0):,}
                                </div>
                            </div>
                        </div>
                    </div>
                    """
                    st.markdown(profile_html, unsafe_allow_html=True)
                
                # ツイート取得
                df = get_user_tweets(user_id, bearer_token, count, include_rts)
                
                if df is not None and not df.empty:
                    st.success(f"{len(df)}件のツイートを取得しました！")
                    
                    # ツイートを表示
                    st.subheader("取得したツイート")
                    st.dataframe(df)
                    
                    # ダウンロードリンク
                    st.markdown(get_csv_download_link(df, username), unsafe_allow_html=True)
                    
                    # データ統計情報
                    if len(df) >= 5:
                        st.subheader("統計情報")
                        
                        col_likes, col_rts = st.columns(2)
                        with col_likes:
                            st.metric("平均いいね数", round(df['like_count'].mean(), 1))
                        with col_rts:
                            st.metric("平均リツイート数", round(df['retweet_count'].mean(), 1))
                        
                        if 'hashtags' in df.columns:
                            all_hashtags = []
                            for tags in df['hashtags'].dropna():
                                if tags:
                                    all_hashtags.extend([tag.strip() for tag in tags.split(',')])
                            
                            if all_hashtags:
                                hashtag_counts = pd.Series(all_hashtags).value_counts().head(5)
                                st.subheader("よく使用されているハッシュタグ")
                                st.bar_chart(hashtag_counts)
                else:
                    st.error("ツイートを取得できませんでした。ユーザー名またはAPI制限を確認してください。")

# 使い方ガイド
with st.expander("使い方ガイド"):
    st.markdown("""
    ### アプリの使い方
    1. サイドバーにTwitter/X APIのBearer Tokenを入力
    2. ツイートを取得したいユーザー名を入力（@は不要）
    3. 取得するツイート数を選択
    4. リツイートを含めるかどうかを選択
    5. 「ツイートを取得」ボタンをクリック
    
    ### Bearer Tokenの取得方法
    1. [Twitter Developer Portal](https://developer.twitter.com/en/portal/dashboard)にアクセス
    2. プロジェクトとアプリを作成
    3. 「Keys and Tokens」からBearer Tokenを取得
    
    ### 注意点
    - Twitter/X API v2を使用しています
    - API利用には制限があります（取得可能なツイート数など）
    - 無料APIプランでは機能が制限されている場合があります
    """)

# APIのデバッグ情報（開発者向け）
with st.expander("API デバッグ情報"):
    st.markdown("""
    ### Twitter API v2について
    
    このアプリはTwitter API v2を使用しています。以下のエンドポイントを利用しています：
    
    1. ユーザー情報取得: `GET /2/users/by/username/:username`
    2. ユーザーツイート取得: `GET /2/users/:id/tweets`
    
    詳細な情報は[公式ドキュメント](https://developer.twitter.com/en/docs/twitter-api)を参照してください。
    """)
    
    if bearer_token:
        st.checkbox("Bearer Tokenをマスクする", value=True, key="mask_token")
        if st.session_state.mask_token:
            display_token = bearer_token[:5] + "*" * (len(bearer_token) - 10) + bearer_token[-5:]
        else:
            display_token = bearer_token
            
        st.code(f"Bearer Token: {display_token}")

# フッター
st.markdown("---")
st.caption("このアプリはStreamlitとTwitter/X API v2を使用しています。©️ 2025")
