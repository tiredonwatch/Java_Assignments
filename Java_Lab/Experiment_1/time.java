import java.util.Scanner;

public class time{
	public static void main(String[] args){
		
		long giveinput = 0;
		int converting_iguess = 0;
		long daysaregone=0;  
		long yearspassby =0; 
		
		
		System.out.println("Convesion Program");
		
		Scanner sc = new Scanner(System.in); 
		giveinput = sc.nextInt();
		
		
		converting_iguess = (int)giveinput/60;
		converting_iguess= converting_iguess/24;
		

		daysaregone = converting_iguess%365;
		
	
		yearspassby= converting_iguess/365;
		
		System.out.println("Years = " + yearspassby);
		System.out.println("Days = " + daysaregone);

		sc.close();
		
	}
}