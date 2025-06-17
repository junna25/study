public class BookAction1 {
    public static void main(String[] args) {
        // Bookオブジェクトを生成
        Book b1 = new Book();

        b1.setName("走れメロス");
        b1.setPrice(450);
        b1.setAuthor("太宰治");

        //書籍情報を出力する
        b1.showinfo();

        System.out.println("---");

        //Bookクラスのオブジェクトを生成しItem2クラスの変数i1に代入
        Item3 i1 = new Book("シャーロック・ホームズ", 600, "コナン・ドイル");

        //商品情報の出力
        i1.showinfo();
    }
}