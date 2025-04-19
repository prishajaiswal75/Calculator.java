import java.util.Scanner;

public class Cube {
    public static void performCube(Scanner sc) {
        try {
            System.out.print("Enter number: ");
            double a = sc.nextDouble();
            System.out.println("Cube = " + (a * a * a));
        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.next();
        }
    }
}

