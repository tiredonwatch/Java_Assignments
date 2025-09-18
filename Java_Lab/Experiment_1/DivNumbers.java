import java.util.Scanner;

public class DivNumbers
{
	public static void main(String[] args){
		{
			int a,b;
			int div = 0;
			System.out.println("Enter Two Numbers");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			b = scan.nextInt();
			// checks if its 0, if it is then prints to screen
			if (b==0){
				System.out.println("No Buddy, Can't happen");
			}
			// divides them if other cases are met, a is divided by b
			else {
				div= a/b;
			}
			
			System.out.println("Division of a and b is " + div +", Program ends");

			scan.close();
		}
	}
}