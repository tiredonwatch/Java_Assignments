import java.util.*;


class Circle implements GeometricObject {
    protected double radius = 1.0;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }
}

public class Diagram {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());

        ResizableCircle rc = new ResizableCircle(10);
        System.out.println("\nResizableCircle Before Resize:");
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());

        rc.resize(50); // shrink to 50% of original size
        System.out.println("\nResizableCircle After Resize (50%):");
        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());
    }
}


