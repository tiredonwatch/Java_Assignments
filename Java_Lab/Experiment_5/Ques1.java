
class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

// Derived class from Shape
class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

// Another derived class from Shape
class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is circular shape");
    }
}

// Subclass of Rectangle
class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

// Main class to test the hierarchy
public class Ques1 {
    public static void main(String[] args) {
        

        Square sq = new Square();
        sq.printShape();
        sq.printRectangle();
        sq.printSquare();

        Circle cr = new Circle();
        cr.printShape();
        cr.printCircle();
    }
}
