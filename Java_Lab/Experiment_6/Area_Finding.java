abstract class Shape {
    protected String shapeName;

    abstract double RectangleArea(double length, double breadth);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}

class Area extends Shape {

    @Override
    double RectangleArea(double length, double breadth) {
        shapeName = "Rectangle";
        double area = length * breadth;
        System.out.println(shapeName + " Area: " + area);
        return area;
    }

    @Override
    double SquareArea(double side) {
        shapeName = "Square";
        double area = side * side;
        System.out.println(shapeName + " Area: " + area);
        return area;
    }

    @Override
    double CircleArea(double radius) {
        shapeName = "Circle";
        double area = Math.PI * radius * radius;
        System.out.println(shapeName + " Area: " + area);
        return area;
    }
}

public class Area_Finding {
    public static void main(String[] args) {
        Area a = new Area();

        a.RectangleArea(10, 5);  // Rectangle
        a.SquareArea(6);         // Square
        a.CircleArea(7);         // Circle
    }
}
