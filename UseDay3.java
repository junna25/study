public class UseDay3 {
    public static void main(String[] args) {
        Day3 d1 = new Day3(1998, 12, 22);
        Day3 d2 = new Day3(1998, 12);

        System.out.println("インスタンスd1の日付は" + d1.formatDay());
        System.out.println("インスタンスd2の日付は" + d2.formatDay());

    }
}
