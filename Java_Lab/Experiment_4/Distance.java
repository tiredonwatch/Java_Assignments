import java.util.*;

class Point {
    private double x;
    private double y;

    // Non-parameterized constructor
     Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Parameterized constructor
     Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
     double getX() {
        return x;
    }

    // Setter for x
     void setX(double x) {
        this.x = x;
    }

    // Getter for y
     double getY() {
        return y;
    }

    // Setter for y
     void setY(double y) {
        this.y = y;
    }

    // Static method to calculate distance between two points
    static double calculateDistance(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Display method with width 7 and precision 2
     void display() {
        System.out.printf("(%7.2f, %7.2f)%n", x, y);
    }
}


public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first point (x1, y1)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        // Input for second point (x2, y2)
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Creating Point objects
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        // Displaying the points
        System.out.print("Point 1: ");
        point1.display();
        System.out.print("Point 2: ");
        point2.display();

        // Calculating and displaying the distance
        double distance = Point.calculateDistance(point1, point2);
        System.out.printf("Distance between the two points: %.2f%n", distance);

        scanner.close();
    }
}

