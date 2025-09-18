import java.util.Scanner;

public class ModNumbers
{
	public static void main(String[] args){
		{
			int a,b;
			int mod = 0;
			System.out.println("Enter Two Numbers");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			b = scan.nextInt();
			// gives us remainder
			mod = a % b;
			System.out.println("Modulo of a and b is " + mod + ", Program ends");

			scan.close();
		}
	}
}