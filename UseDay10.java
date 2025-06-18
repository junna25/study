public class UseDay10 {
    public static void main(String[] args) {
        try{
            Day10 d1 = new Day10(1995, 12, 23);
            Day10 d2 = new Day10(1998, 12, 22);
            Day10 d3 = new Day10(2025, 6, 18);

            System.out.println("インスタンスd1の日付は" + d1);
            System.out.println("インスタンスd2の日付は" + d2);
            System.out.println("インスタンスd3の日付は" + d3);
        } catch (InvalidDayException e){
            e.printStackTrace();
        }
    }
}
