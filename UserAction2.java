import java.util.Scanner;

public class UserAction2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Userオブジェクトを生成し変数userに代入する
        User user = new User();

        //キーボードから名前と年齢を取得しuserにセットする
        System.out.println("会員を登録します");
        System.out.print("名前: ");
        user.name = scan.next();
        System.out.print("年齢: ");
        user.age = scan.nextInt();

        System.out.println("---");
        System.out.println("会員を登録しました");

        //userの情報を出力する
        System.out.println("名前: " + user.name);
        System.out.println("年齢: " + user.age);


        scan.close();
    }
}