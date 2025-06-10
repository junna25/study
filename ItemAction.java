public class ItemAction {
    public static void main(String[] args) {

        // Itemクラスのオブジェクトを生成し変数item1に代入する
        item item1 = new item();

        // item1のフィールドに商品名｢絵本｣､価格｢1000｣を設定する
        item1.name = "絵本";
        item1.price = 1000;

        // item1を利用して商品名と価格の情報を出力する
        System.out.println("商品名: " + item1.name);
        System.out.println("価格: " + item1.price + "円");

        System.out.println("---");

        //Itemクラスのオブジェクトを生成し変数item2に代入する
        item item2 = new item();

        //item2フィールドのに商品名｢シャンプー｣､価格｢222｣を設定する
        item2.name = "シャンプー";
        item2.price = 222;

        //showinfo()メソッドを利用して情報を出力する
        item2.showinfo();
    }
}