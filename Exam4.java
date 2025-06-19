import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("年齢を入力してください:");
        int age = -1;
        while (true) {
            try {
                age = Integer.parseInt(scan.nextLine());
                if (age < 0 || age > 130) {
                    System.out.println("年齢は0以上130以下で入力してください");
                    break;
                } else {
                    System.out.println(age + "歳で登録しました");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("整数を入力してください");
                break;
            }
        }
        scan.close();
    }
}
