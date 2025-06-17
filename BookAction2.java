public class BookAction2 {
    public static void main(String[] args) {
        
        // Itemクラスの配列を生成しItemとBookのオブジェクトを複数格納
        Item3[] items = new Item3[4];

        items[0] = new Item3("ロボット掃除機", 50000);
        items[1] = new Book("鬼滅の包丁", 450, "GO峠呼世晴");
        items[2] = new Book("1", 500, "尾田A一郎");

        // 繰り返し処理で1件ずつ商品情報を出力
        for (Item3 item : items) {
            item.showinfo();
            System.out.println("---");
        }
    }
}