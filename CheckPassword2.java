import java.util.Scanner;

public class CheckPassword2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctpassword = "himitu";
        while (true) {
            System.out.print("パスワードを入力してください:");
            String password = scanner.nextLine();

            if (password.equals(correctpassword)) {
                System.out.println("ログインできました");
                break;
            } else {
                System.out.println("再入力してください");
            }
        }
        scanner.close();
    }
}