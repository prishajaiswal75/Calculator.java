import java.util.Scanner;

public class SquareRoot {
    public static void performSquareRoot(Scanner sc) {
        try {
            System.out.print("Enter number: ");
            double a = sc.nextDouble();
            if (a < 0) {
                throw new ArithmeticException("Cannot take square root of negative number!");
            }
            System.out.println("Square Root = " + Math.sqrt(a));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.next();
        }
    }
}
