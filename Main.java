import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Addition.performAddition(sc);
                    break;
                case 2:
                    Subtraction.performSubtraction(sc);
                    break;
                case 3:
                    Multiplication.performMultiplication(sc);
                    break;
                case 4:
                    Division.performDivision(sc);
                    break;
                case 5:
                    Square.performSquare(sc);
                    break;
                case 6:
                    Cube.performCube(sc);
                    break;
                case 7:
                    SquareRoot.performSquareRoot(sc);
                    break;
                case 8:
                    System.out.println("Exiting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        sc.close();
    }
}
