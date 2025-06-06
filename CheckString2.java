import java.util.Scanner;

public class CheckString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("色を入力してください:");
        String color = scan.nextLine();
        String 赤 = "red";
        String 緑 = "green";
        String 青 = "blue";

        if (color.equals(赤)) {
            System.out.println("赤色です｡");
        } else if (color.equals(緑)) {
            System.out.println("緑色です｡");
        } else if (color.equals(青)) {
            System.out.println("青色です｡");
        } else {
            System.out.println("他の色を入力してください");
        }
        scan.close();
    }
}