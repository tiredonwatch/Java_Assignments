import java.util.Scanner;

public class AddNumbers
{
	public static void main(String[] args){
		{
			int a,b;
			int sum=0;
			System.out.println("Enter Two Numbers");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			b = scan.nextInt();
			
			sum = a + b;
			System.out.println("Sum of a and b is " + sum + ", Program ends");

			scan.close();
		}
	}
}