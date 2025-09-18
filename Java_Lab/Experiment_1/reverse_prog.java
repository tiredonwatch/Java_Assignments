import java.util.*;

public class reverse_prog {
    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);
        int number = scanning.nextInt();
        int rev = 0;
        rev = rev * 10 + number % 10;
        number = number / 10;
        rev = rev * 10 + number % 10;
        number = number / 10;
        rev = rev * 10 + number % 10;
        System.out.println(rev);

        scanning.close(); //closing to stop resource leakage
    }
}
