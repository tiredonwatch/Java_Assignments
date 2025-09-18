class Triangle {
    // Defining sides of the triangle
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public int calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2.0;
        
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        
        return area;
    }
}

public class Triangle_AP{
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        
        System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
        System.out.println("Area of the triangle: " + triangle.calculateArea());
    }
}