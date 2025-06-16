public class UseDay2 {
    public static void main(String[] args) {
        Day2 d1 = new Day2(1998, 12, 22);
        Day2 d2 = new Day2(2022, 12,16);

        System.out.println("インスタンスd1の日付は" + d1.formatDay());
        System.out.println("インスタンスd2の日付は" + d2.formatDay());
    }
}
