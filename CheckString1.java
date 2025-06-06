import java.util.Scanner;

public class CheckString1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("パスワード:");
        String password = scan.nextLine();
        String correctpassword = "himitu";

        if (password.equals(correctpassword)) {
            System.out.println("一致しました｡");
        } else {
            System.out.println("一致しませんでした｡");
        }
        scan.close();
    }
}
