import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the base of the triangle:");
        int base = scanner.nextInt();
        
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        
        double triangleArea = calculateTriangleArea(base, height);
        System.out.println("Area of the triangle: " + triangleArea);

        
        System.out.println("Enter the side length of the square:");
        double sideLength = scanner.nextDouble();
        
        double squareArea = calculateSquareArea(sideLength);
        System.out.println("Area of the square: " + squareArea);

        scanner.close();
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }
}
