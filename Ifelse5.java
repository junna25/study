import java.util.Scanner;

public class Ifelse5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("テストの点数を入力してください:");
        int score = scan.nextInt();

        if (score >= 80) {
            System.out.println("やるじゃん");
        } else if (score >= 60) {
            System.out.println("そこそこですね(指摘)");
        } else {
            System.out.println("もう少し頑張りましょう");
        }

        scan.close();
    }
}