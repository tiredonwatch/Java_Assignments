public class Pyramid{
    public static void main(String[] args){
        int rows = 5; // 5 size rahega pyramid ka
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" "); // spaces print hongi
            }
            for (int j=1;j<=(2*i-1);j++){
                System.out.print("*"); // stars print honge
            }
            System.out.println(); // next line me jane ek liye
        }
    }
}