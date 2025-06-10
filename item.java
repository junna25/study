public class item {
    //フィールド(商品名と価格を定義する)
    String name;
    int price;

    //情報出力用showinfo()メソッド
    public void showinfo(){
        System.out.println("商品名: " + name);
        System.out.println("価格(税抜): " + (int)(price) + "円");
        System.out.println("価格(税込): " + (int)(price * 1.1) + "円");
    }
    
}
