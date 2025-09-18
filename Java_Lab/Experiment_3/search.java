import java.util.*;

public class search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int looper = input.nextInt();

        int[] a = new int[looper];

        for (int i = 0; i < looper; i++){
            a[i] = input.nextInt(); //it'll give input values to array to set on specific indexes, it'll run till i < looper.
        }

        int x = input.nextInt();
        boolean found = false;
        for (int i = 0; i < looper; i++) {
            if (a[i] == x) {
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("Element Found!");
        }
        else
        {
            System.out.println("Element not found.");
        }


        input.close();
    }
}
