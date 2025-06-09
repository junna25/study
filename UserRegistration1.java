import java.util.Scanner;

public class UserRegistration1 {
    public static void main(String[] args) {
        Scanner miyu = new Scanner(System.in);

        System.out.print("名前を入力してください : ");
        String name = miyu.next();

        if (!isValidName(name)) {
            System.out.println("名前が不正です。登録できません。");
            miyu.close();
            return;
        }

        System.out.print("年齢を入力してください : ");
        int age = miyu.nextInt();

        if (!isValidAge(age)) {
            System.out.println("年齢が不正です。登録できません。");
            miyu.close();
            return;
        }

        System.out.println("名前 : " + name + " 年齢 : " + age + "で登録しました｡");

        miyu.close();
    }

    static boolean isValidName(String name) {
        //名前が20文字より大きい場合エラー
        if (name.length() > 20) return false;

        //名前が｢Admin｣に一致する場合エラー
        if (name.equals("admin")) return false;

        //名前に禁止文字｢㌔｣が含まれている場合エラー
        if (name.contains("㌔")) return false;
        return true;
    }

    static boolean isValidAge(int age) {
       //年齢が0未満､または､130より大きい場合エラー
        return age >= 0 && age <= 130;
    }
}