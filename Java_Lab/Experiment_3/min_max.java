import java.util.*;

public class min_max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int threshold = input.nextInt();

        int[] array = new int[threshold]; //max capacity of array.

        for (int i = 0; i < threshold; i++){ // values being stored till max threshold is reached
            array[i] = input.nextInt();
        }

        int max = array[0], min = array[0]; // 
        for (int i = 1; i < threshold; i++) {
            if (array[i] > max)
            { 
                max = array[i];
            }
            if (array[i] < min){
                 min = array[i];
            }
        }
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);

        input.close();
    }
}
