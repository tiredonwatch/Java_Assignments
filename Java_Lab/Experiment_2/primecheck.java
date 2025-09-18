import java.util.Scanner;

public class primecheck {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        boolean isPrime = num > 1; // Numbers less than or equal to 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false; // If divisible, it's not prime
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }
}
