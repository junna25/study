public class Item3 {
    // フィールド
    private String name;
    private int price;

    //コンストラクタ
    public Item3() {
    }

    public Item3(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //ゲッターセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //情報出力用showinfoメソッド
    public void showinfo() {
        System.out.println("商品名:" + this.getName());
        System.out.println("価格:" + this.getPrice() + "円");
    }
}