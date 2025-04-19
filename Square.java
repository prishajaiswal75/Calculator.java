import java.util.Scanner;

public class Square {
    public static void performSquare(Scanner sc) {
        try {
            System.out.print("Enter number: ");
            double a = sc.nextDouble();
            System.out.println("Square = " + (a * a));
        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.next();
        }
    }
}
