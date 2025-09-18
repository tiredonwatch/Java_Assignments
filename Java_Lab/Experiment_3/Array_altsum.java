import java.util.*;


public class Array_altsum {

    public static void ArraySum(int[] arr){
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of all elements = "+sum);
    }

    public static void AltArraySum(int[] arr){
        int altersum=0;
        for(int i=0;i<5;){
            altersum = altersum+arr[i];
            i+=2;
        }
        System.out.println("Sum of alternate elements = "+altersum);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
		int a;
		for(int i=0;i<5;i++){
			System.out.print("Enter Element "+(i+1)+" :");
			a=scanner.nextInt();
			arr[i]=a;
		}     
        System.out.println("--Your Array--");
		for(int j=0;j<5;j++){
			System.out.println("Element "+(j+1)+" : "+arr[j]);
		}
        ArraySum(arr);        
        AltArraySum(arr);  
        
        scanner.close();
    }
}
