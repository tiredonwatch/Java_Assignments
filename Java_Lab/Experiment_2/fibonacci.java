import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < number; i++) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }

        scan.close();
    }
}
