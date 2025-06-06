import java.util.Scanner;

public class CheckPassword1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctpassword = "himitu";
        boolean success = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("パスワードを入力してください:");
            String password = scanner.nextLine();

            if (password.equals(correctpassword)) {
                System.out.println("ログインできました");
                success = true;
                break;
            } else {
                System.out.println("不正解です");
            }
        }

        if (!success) {
            System.out.println("3回間違えたので終了します");
        }
        scanner.close();
    }
}