import java.util.Scanner;

public class ArrayOddEven {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		int usersize;
		System.out.print("Enter array size: ");
		usersize=scan.nextInt();
		int arr[] = new int[usersize];
		int a;
		for(int i=0;i<usersize;i++){
			System.out.print("Enter Element "+(i+1)+" :");
			a=scan.nextInt();
			arr[i]=a;
		}
		for(int j=0;j<usersize;j++){
			System.out.println("Element "+(j+1)+" : "+arr[j]);
		}
        int odd=0;
        int even=0;
		for(int i=0;i<usersize;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
		}        
        System.out.println("Number of odd: "+odd);
        System.out.println("Number of odd: "+even);

		scan.close();
    }
}
