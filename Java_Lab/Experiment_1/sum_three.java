import java.util.*;

public class sum_three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0; // for no garbage value.
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        System.out.println(sum);

        scan.close();
    }
}

