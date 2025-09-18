import java.util.*;

public class quadratic{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            System.out.println("Roots: " + (-b + Math.sqrt(discriminant)) / (2 * a) + " and " + (-b - Math.sqrt(discriminant)) / (2 * a)); //for - and +.
        } else if (discriminant == 0) {
            System.out.println("Root: " + -b / (2 * a));
        }
        
        scan.close();
    }
}
