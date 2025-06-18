import java.util.ArrayList;

public class ItemListSample {
    public static void main(String[] args) {
        //文字列を保持できるリストの作成
        ArrayList<String> items = new ArrayList<>();

        //｢ロボット掃除機｣､｢ドラム式洗濯機｣､｢液晶テレビ｣の追加
        items.add("ロボット掃除機");
        items.add("ドラム式洗濯機");
        items.add("液晶テレビ");

        // 拡張for文を利用して全商品を出力する
        for (String item : items) {
            System.out.println(item);
        }
    }
}