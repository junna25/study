import java.util.Scanner;


public class UsePhoneScan {

// インターフェース
interface Phone {
    void call(String number);
    void mail(String address, String message);
}

// Phone実装クラス
static class HandyPhone implements Phone {
    private String myNumber;
    private String myAddress;

    public HandyPhone(String myNumber, String myAddress) {
        this.myNumber = myNumber;
        this.myAddress = myAddress;
    }

    @Override
    public void call(String number) {
        System.out.println("電話をかけます: " + number + " から " + myNumber);
    }

    @Override
    public void mail(String address, String message) {
        System.out.println("メール送信: " + address + " から " + myAddress + " 内容: " + message);
    }
}

public class UsePhone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1: Phone  2: HandyPhone");
        System.out.print("どちらを使いますか？: ");
        scan.nextLine(); // 改行消費

        System.out.print("自分の電話番号: ");
        String myNumber = scan.nextLine();
        System.out.print("自分のメールアドレス: ");
        String myAddress = scan.nextLine();

        Phone phone;
        // 今回はHandyPhoneのみ実装
        phone = new HandyPhone(myNumber, myAddress);

        System.out.print("宛先の電話番号: ");
        String toNumber = scan.nextLine();
        phone.call(toNumber);

        System.out.print("宛先のメールアドレス: ");
        String toAddress = scan.nextLine();
        System.out.print("メール内容: ");
        String message = scan.nextLine();
        phone.mail(toAddress, message);

        scan.close();
    }
}
}

