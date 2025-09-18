import java.util.Scanner;

public class conversion{
	public static void main(String[] args){
		System.out.println("Converting Celsius to Fahrenheit");
		
		int input = 0;
		
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		
		int fahrenheit;
		
		fahrenheit = ((input * 9)/5) + 32;
		
		System.out.println("The answer of conversion is: " + fahrenheit);

		scan.close();
	}	
}