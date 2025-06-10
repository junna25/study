public class Convert {
    
    public static void reverse(int input) {
        StringBuilder sb = new StringBuilder(String.valueOf(input));
        System.out.println(sb.reverse().toString());
    }

    public static void reverse(double input) {
        StringBuilder sb = new StringBuilder(String.valueOf(input));
        System.out.println(sb.reverse().toString());
    }

    public static void reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse().toString());
    }
}