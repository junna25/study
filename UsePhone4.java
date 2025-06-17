public class UsePhone4 {
    public static void main(String[] args) {
        HandyPhone4 h = new HandyPhone4("090-8888-6666", "abc@aaa.com");
        System.out.println("HandyPhone4を使う");
        h.tel("080-444-5555");
        h.mail("myfriends@gmail.com");
        h.info();
    }
}
