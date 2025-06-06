import java.util.Scanner;

public class Introduce2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("情報を登録します");
        String name = scanner.nextLine();
        
        String[] hobbies = new String[3];
        for(int i = 0; i < 3; i++) {
            System.out.print("趣味" + (i+1) + ":");
            hobbies[i] = scanner.nextLine();
        }
        
        System.out.println("\nこんにちは" + name + "です。");
        System.out.println("私の趣味は､");
        for(String hobby : hobbies) {
            System.out.println("・" + hobby);
        }
        System.out.println("です。");
        
        scanner.close();
    }
}
 