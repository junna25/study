public class LoopSample2 {
    public static void main(String[] args) {
        int[] num = {7, 12, 37, 24, 2, 92, 51};
        
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if(i < num.length - 1) {
                System.out.println(" ");
            }
        }
    }
}
