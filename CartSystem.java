import java.util.ArrayList;
import java.util.Scanner;

public class CartSystem {
    //商品情報保存リスト
    private ArrayList<Item4> items = new ArrayList<>();

    //スキャナークラス
    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        CartSystem cs = new CartSystem();
        cs.run();
    }

    public void run() {
        while (true) {
            System.out.println("1:商品追加");
            System.out.println("2:書籍追加");
            System.out.println("9:終了");
            System.out.print("メニューを選択してください: ");
            int menu = 0;
            try {
                menu = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("数字で入力してください。");
                continue;
            }

            if (menu == 1) {
                addItem();
                showCart();
            } else if (menu == 2) {
                addBook();
                showCart();
            } else if (menu == 9) {
                System.out.println("終了します。");
                break;
            } else {
                System.out.println("正しい番号を入力してください。");
            }
        }
        scan.close();
    }

    private void addItem() {
        System.out.println("商品をカートに追加します");
        System.out.print("商品名を入力してください:");
        String name = scan.nextLine();
        System.out.print("価格を入力してください:");
        int price = 0;
        try {
            price = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("価格は整数で入力してください。");
            return;
        }
        items.add(new Item4(name, price));
        System.out.println("商品を追加しました。");
    }

    private void addBook() {
        System.out.println("書籍をカートに追加します");
        System.out.print("書籍名: ");
        String name = scan.nextLine();
        System.out.print("著者: ");
        String author = scan.nextLine();
        System.out.print("価格: ");
        int price = 0;
         try {
            price = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("価格は整数で入力してください。");
            return;
        }
        items.add(new Book2(name, price, author));
        System.out.println("書籍を追加しました。");
    }

    private void showCart() {
        System.out.println("=== カート一覧 ===");
        int number = 1;
        for (Item4 item : items) {
        System.out.println(number + ".  " + item.getinfo());
        number++;
        }
        System.out.println("-----------------");
    }
}