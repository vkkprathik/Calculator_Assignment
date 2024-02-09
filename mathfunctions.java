import java.util.Scanner;

public class mathfunctions{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Square root");
        System.out.println("2. Power");
        System.out.println("3. Absolute value");
        System.out.println("4. Sine");
        System.out.println("5. Cosine");
        System.out.println("6. Random number");

        System.out.print("Choose a functionality (1-6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num1 = scanner.nextInt();
                System.out.println("Square root: " + Math.sqrt(num1));
                break;
            case 2:
                System.out.print("Enter base: ");
                 int base = scanner.nextInte();
                System.out.print("Enter exponent: ");
                int exponent = scanner.nextInt();
                System.out.println("Result: " + Math.pow(base, exponent));
                break;
            case 3:
                System.out.print("Enter a number: ");
                 int num2 = scanner.nextInt();
                System.out.println("Absolute value: " + Math.abs(num2));
                break;
            case 4:
                System.out.print("Enter an angle in radians: ");
                 int angle = scanner.nextInt();
                System.out.println("Sine: " + Math.sin(angle));
                break;
            case 5:
                System.out.print("Enter an angle in radians: ");
                int angle2 = scanner.nextInt();
                System.out.println("Cosine: " + Math.cos(angle2));
                break;
            case 6:
                System.out.println("Random number between 0 and 1: " + Math.random());
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}