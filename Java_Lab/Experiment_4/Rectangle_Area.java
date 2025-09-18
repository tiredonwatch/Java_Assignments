import java.util.*;

class Area {
    int length;
    int breadth;

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int returnArea() {
        return length * breadth;
    }
}

public class Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        Area rectangle = new Area(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.returnArea());

        scanner.close();
    }
}
