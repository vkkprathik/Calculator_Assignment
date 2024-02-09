import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        double num2 = scanner.nextInt();

        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square");
        System.out.println("6. Cube");
        System.out.println("7. Modulus");
        System.out.println("8. Power");
        


        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;
            case 5:
                System.out.println("Result: " + square(num1));
                break;
            case 6:
                System.out.println("Result: " + cube(num1));
                break;
            case 7:
                System.out.println("Result: " + modulus(num1, num2));
                break;
            case 8:
                System.out.println("Enter the exponent for power operation:");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + power(num1, exponent));
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero");
            return Double.NaN; 
        }
    }

    public static double square(double num) {
        return num * num;
    }

    public static double cube(double num) {
        return num * num * num;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
