public class Method1 {
    public static void main(String[] args) {
        double result = divide(5.5, 2.5);
        System.out.println("結果: " + result);
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("0で割ることはできません");
            return 0;
        }
        return a / b;
    }
}