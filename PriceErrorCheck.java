import java.util.Scanner;

public class PriceErrorCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("価格を入力してください: ");
        int price = 0; //価格初期値0

        //整数チェック
        try {
            price = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("整数で入力してください。");
            scan.close();
            return;
        }

        //範囲チェック
        if (price < 0) {
            System.out.println("マイナスの値です");
            scan.close();
            return;
        }

        System.out.println(price + "円を登録しました");
        scan.close();
    }
}