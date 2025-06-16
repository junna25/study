import java.util.Scanner;

public class UseCustomer1 {
    public static void main(String[] args) {
        Customer2[] customerList = new Customer2[3];
        Scanner scan = new Scanner(System.in);

        //顧客データの読み込み
        for (int i = 0; i < customerList.length; i++){
            System.out.println((i+1) + "人目の顧客情報を入力してください｡");
            System.out.print("ID(指定しない場合は-1と入力):");
            int id = scan.nextInt(); //IDの入力
            System.out.print("名前:");
            String name = scan.next(); //名前の入力

            Customer2 customer;
            if (id == -1){
                //IDが-1なら名前だけ登録
                customer = new Customer2(name);
            } else {
                //IDが-1でなければIDと名前を登録
                customer = new Customer2(id, name);
            }
            customerList[i] = customer;
        }

        //顧客データ表示
        System.out.println();
        System.out.println("===顧客データ一覧===");
        for(Customer2 customer:customerList){
            customer.showData();
        }
        scan.close();
    }
}
