public class ItemAction1 {
    public static void main(String[] args) {
        // 商品オブジェクトを生成
        Item2 item = new Item2();

        // セッターを利用して情報(絵本/1000円)をセットする
        item.setName("絵本");
        item.setPrice(1000);

        // ゲッターを利用して商品の情報を出力する
        System.out.println("商品名: " + item.getName());
        System.out.println("価格: " + item.getPrice() + "円");
        System.out.println("---");

        // コンストラクタを利用し初期化(シャンプー/222円)と
        //同時に商品オブジェクトを生成する
        Item2 item2 = new Item2("シャンプー", 222);

        //商品情報出力用のメソッドを利用して出力する
        item2.showinfo();
    }
       
}