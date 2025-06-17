public class UsePhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.no = "03-1234-5555";
        System.out.println("Phoneを使う");
        p.tel("0120-777-999");

        HandyPhone h = new HandyPhone();
        h.no = "090-8888-6666";
        h.mailAddress = "abc@aaa.com";
        System.out.println("HandyPhoneを使う");
        h.tel("080-444-5555");
        h.mail("myfriend@zzz.yyy.com");

    }
}
