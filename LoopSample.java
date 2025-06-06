public class LoopSample {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        if (sum == 55) {
            System.out.println("1から10までの合計は " + sum + " です。");
        }
    }
}
