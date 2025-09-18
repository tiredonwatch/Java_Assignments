import java.util.Scanner;

public class MultiNumbers
{
	public static void main(String[] args){
		{
			int a,b; 
			int multi= 0;
			System.out.println("Enter Two Numbers");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			b = scan.nextInt();
			// multiplies two numbers
			multi = a * b;
			System.out.println("Multiplication of a and b is " + multi + ", Program ends");
			
			scan.close();
		}
	}
}