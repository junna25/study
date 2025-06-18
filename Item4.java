public class Item4 {
    // フィールド（外部からのアクセス禁止）
    private String name;
    private int price;

    // デフォルトコンストラクタ
    public Item4() {
        this.name = "";
        this.price = 0;
    }

    public Item4(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void showinfo() {
        System.out.println("商品名:" + name);
        System.out.println("価格: " + price + "円");
        System.out.println("---");
    }

    public String getinfo() {
        return name + " / " + price + "円";
    }
}