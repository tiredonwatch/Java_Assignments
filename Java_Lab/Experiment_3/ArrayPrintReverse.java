import java.util.Scanner;

public class ArrayPrintReverse {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		int a;
		for(int i=0;i<5;i++){
			System.out.print("Enter Element on index."+(i+1)+" :");
			a=scan.nextInt();
			arr[i]=a;
		}
        System.out.print("[");
		for(int j=4;j>(-1);j--){
            System.out.print(" "+arr[j]+" ");
		}      
        System.out.print("]");

		scan.close();
    }
}
