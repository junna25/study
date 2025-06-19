import java.util.Scanner;

public class Exam1 {    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("名前:");
        String name = scan.nextLine();

        System.out.print("年齢:");
        int age = scan.nextInt();

        int futureAge = age + 10;

        System.out.println(name + "さんの10年後の年齢は" + futureAge + "歳です!");

        scan.close();
    }
}
