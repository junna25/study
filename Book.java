public class Book extends Item3 {
    private String author;

    public Book() {
        super();
        this.author = "";
    }

    public Book(String name, int price, String author) {
    super(name, price);
    this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println("著者:" + author); 
    }   
}