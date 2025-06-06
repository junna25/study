import java.util.Scanner;

public class Keyboad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("名字を入力してください:");
        String lastname = scan.nextLine();
        System.out.print("名前を入力してください:");
        String firstname = scan.nextLine();

        System.out.println("あなたのフルネームは " + lastname + " " + firstname + " ですね｡");

        scan.close();

    }
}
