public class Exam2 {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 1;
        array[1] = 5;
        array[2] = 4;
        array[3] = 3;
        array[4] = 2;

        for (int num : array) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
