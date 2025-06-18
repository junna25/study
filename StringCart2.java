import java.util.ArrayList;
import java.util.Scanner;

public class StringCart2 {
    public static void main(String[] args) {
        //文字列を保持できるリストの作成
        ArrayList<String> items = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        //キーボードからリストに追加するを3回繰り返す
        for (int i = 0; i < 3; i++) {
            System.out.print("商品を追加してください: ");
            String name = scan.nextLine();
            items.add(name);
        }

        // 拡張for文を利用して全商品を出力する
        for (String item : items) {
            System.out.println(item);
        }
        scan.close();
    }
}