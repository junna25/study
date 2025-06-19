
import java.util.HashMap;
import java.util.Scanner;

public class Exam9 {

    Scanner scan = new Scanner(System.in);
    HashMap <String, String> map = new HashMap<>();

    public static void main(String[] args) {
        Exam9 address = new Exam9();
        address.run();
    }

    public void run() {
        while (true) {
            System.out.println("1:登録 2:削除 3:一覧表示 9:終了");
            System.out.print("操作番号を入力してください: ");
        int menu = 0;
            try {
                menu = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("数字で入力してください。");
                continue;
            }

            if (menu == 1) {
                addadd();
            } else if (menu == 2) {
                deladdress();
            } else if (menu == 3) {
                showall();
            } else if (menu == 9) {
                System.out.println("アプリケーションを終了します");
                break;
            } else {
                System.out.println("正しい番号を入力してください。");
            }

        System.out.print("名前を入力してください:");
//     String name = scan.next();

        System.out.print("電話番号を入力してください:");
 //       int phonenum = scan.nextInt();

        scan.close();
        }
    }

    private void addadd(){
        System.out.print("名前を入力してください:");
//        String name = scan.nextLine();
        System.out.print("電話番号を入力してください:");
//        String num = scan.nextLine();
//        map.put(new map(name, num));

    }

    private void deladdress(){

    }

    private void showall(){
        
    }
}
