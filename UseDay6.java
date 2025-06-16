public class UseDay6 {
    public static void main(String[] args) {
        Day5[] ary = {  new Day5(1998, 12, 22),
                        new Day5(2010, 10, 5),
                        new Day5(2025, 6, 17) };
        for (int i = 0; i < ary.length; i++){
            System.out.println(ary[i].formatDay());
        }

        System.out.println();
        //拡張for文で出力
        for (Day5 day : ary) {
            System.out.println(day.formatDay());
        }
    }
}
