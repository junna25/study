import java.util.Scanner;

public class CalcPoints2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("購入金額 : ");
        int price = scan.nextInt();
        System.out.println("1:プレミア会員, 2:無料会員");
        System.out.print("会員ランク : ");
        int rank = scan.nextInt();

        if (rank != 1 && rank != 2) {
            System.out.println("1または2を選択してください。処理を終了します。");
            scan.close();
            return;
        }
        
        boolean isPremium = (rank == 1);
        int points = getPoints(price, isPremium);
        System.out.println("付与ポイント: " + points);

        scan.close();
    }

    static int getPoints(int price, boolean isPremium) {
        if (isPremium) {
            return (int)(price * 0.2);
        } else {
            return (int)(price * 0.1);
        }
    }
}
