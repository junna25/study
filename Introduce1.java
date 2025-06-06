import java.util.ArrayList;

public class Introduce1 {
    public static void main(String[] args) {
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("ダンス");
        hobbies.add("映画");
        hobbies.add("バイク");
        
        System.out.println("こんにちは田中太郎です");
        System.out.println("私の趣味は");
        for(String hobby : hobbies) {
            System.out.println("・" + hobby);
        }
        System.out.println("です");
    }
}
