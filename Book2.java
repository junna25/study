public class Book2 extends Item4 {
    private String author;

    // デフォルトコンストラクタ
    public Book2() {
        super();
        this.author = "";
    }

    public Book2(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showinfo() {
        System.out.println("商品名:" + getName());
        System.out.println("価格: " + getPrice() + "円");
        System.out.println("著者: " + author);
        System.out.println("---");
    }

    public String getinfo() {
        return getName() + "(著:" + author + ")/" + getPrice() + "円";
    }
}