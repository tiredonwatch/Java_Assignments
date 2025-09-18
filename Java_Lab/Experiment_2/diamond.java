import java.util.*;

public class diamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int input = scanner.nextInt();
        
        // Top half of the diamond
        for (int i = 1; i <= input; i++) {
            for (int j = i; j < input; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half of the diamond
        for (int i = input - 1; i >= 1; i--) {
            for (int j = input; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
