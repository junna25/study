public class Exam3 {
    static int calculateRectangleArea(int width, int height) {
        return width * height;
    }
    static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        
        int rectangleArea = calculateRectangleArea(1, 9);
        System.out.println(rectangleArea);

        double triangleArea = calculateTriangleArea(3, 3);
        System.out.println(triangleArea);
    }
}
