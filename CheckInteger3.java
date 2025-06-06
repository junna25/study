import java.util.Scanner;

public class CheckInteger3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("年齢を入力してください");
        int age = scan.nextInt();

        if (age < 0) {
            System.out.println("正しい数値を入力してください");
        } else if (age > 130){
            System.out.println("0~130で入力してください｡");
        } else {
            System.out.println("正しい年齢です｡");  
        } 

        scan.close();
        }
     }
