public class IntegerArray2 {
    public static void main(String[] args) {
        int[] numbers  = {1, 7, 2, 7, 3 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("合計: " + sum);
    }
}
