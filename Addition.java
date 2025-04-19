import java.util.Scanner;

public class Addition {
    public static void performAddition(Scanner sc) {
        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            double result = a + b;
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
            sc.next(); // Clear buffer
        }
    }
}
