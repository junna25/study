public class IntegerArray3 {
     public static void main(String[] args) {
        int[] numbers  = {1, 7, 2, 7, 3, 7, 7, 5, 8 };
        int count = 0;
        for (int i = 0; i < numbers.length ; i++){
            if(numbers[i] == 7){
            count++;
            }
        }
        System.out.println(count + "個ありました｡");
    }
}
