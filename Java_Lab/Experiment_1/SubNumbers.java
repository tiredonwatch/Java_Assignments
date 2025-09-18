import java.util.Scanner;

public class SubNumbers
{
	public static void main(String[] args){
		{
			int a,b;
			int sub = 0;
			System.out.println("Enter Two Numbers");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			b = scan.nextInt();
			// checks if a is greater than b
			if (a>b){
				sub= a-b;
			}
			
			else if (b>a){
				sub= b-a;
			}
			
			System.out.println("Subtraction of a and b is " + sub + " When b is greater than a " + ", Program ends");

			scan.close();
		}
	}
}