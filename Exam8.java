import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: グー, 2: チョキ, 3: パー");
        System.out.print("じゃんけん...");
        
        int userHand = scanner.nextInt();
        int computerHand = (int) (Math.random() * 3);
        
        System.out.println("コンピュータは" + handToString(computerHand) + "!");
        
        if (userHand == computerHand) {
            System.out.println("あいこです！");
        } else if ((userHand == 0 && computerHand == 1) || 
                   (userHand == 1 && computerHand == 2) || 
                   (userHand == 2 && computerHand == 0)) {
            System.out.println("あなたの勝ち");
        } else {
            System.out.println("あなたの負け");
        }
        
        scanner.close();
    }

    public static String handToString(int hand) {
        switch (hand) {
            case 1:
                return "グー";
            case 2:
                return "チョキ";
            case 3:
                return "パー";
            default:
                return "不明";
        }
    }
}
