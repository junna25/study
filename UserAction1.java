public class UserAction1 {
    public static void main(String[] args) {
        //田中太郎(20)の情報を登録して出力
        User user1 = new User();
        user1.name = "田中太郎";
        user1.age = 20;

        user1.showinfo();

        System.out.println("---");

        //鈴木一郎(25)の情報を登録して出力
        User user2 = new User();
        user2.name = "鈴木一郎";
        user2.age = 25;

        user2.showinfo();

        System.out.println("---");

        //結城美優(26)の情報を登録して出力
        User user3 = new User();
        user3.name = "結城美優";
        user3.age = 26;
        
        user3.showinfo();
    }
}