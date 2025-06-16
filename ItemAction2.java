public class ItemAction2 {
    public static void main(String[] args) {
        
        //3つの要素を持つ商品クラスの配列を生成
        Item2[] items = new Item2[3];
        items[0] = new Item2("ロボット掃除機", 50000);
        items[1] = new Item2("空気清浄機", 20000);
        items[2] = new Item2("扇風機", 4000);

        //拡張for文とshowinfoメソッドを利用して
        //1件ずつ商品情報を出力する
        for (Item2 item : items) {
            System.out.println("商品名: " + item.getName());
            System.out.println("価格: " + item.getPrice() + "円");
            System.out.println("---");
        }


    }
}
