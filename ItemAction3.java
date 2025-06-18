// ItemAction.java
import java.util.ArrayList;

public class ItemAction3 {
    public static void main(String[] args) {
        // Item4クラスのリストを作成
        ArrayList<Item4> items = new ArrayList<>();

        // 商品をリストに3つ追加
        items.add(new Item4("ロボット掃除機", 50000));
        items.add(new Item4("ドラム式洗濯機", 200000));
        items.add(new Item4("液晶テレビ", 100000));
        items.add(new Book2("1ピース", 450, "尾田"));
        items.add(new Book2("鬼滅の包丁", 500, "Go峠"));

       for (Item4 item : items) {
        item.showinfo();
        }
    }
}