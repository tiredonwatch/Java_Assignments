import java.util.*;

// Base class
class Vehicle {
    void display() {
        System.out.println("This is a Vehicle.");
    }
}

// Derived class
class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car.");
    }
}

// Derived class
class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike.");
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of tyres (e.g., 2 for Bike, 4 for Car): ");
        int tyres = scanner.nextInt();

        Vehicle vehicle; //obj for Vehile class.

        switch (tyres) {
            case 2:
                vehicle = new Bike();
                System.out.println("\n[Info] Bike object created.");
                break;

            case 4:
                vehicle = new Car();
                System.out.println("\n[Info] Car object created.");
                break;

            default:
                vehicle = new Vehicle();
                System.out.println("\n[Info] General Vehicle object created.");
                break;
        }

        vehicle.display();
        scanner.close();
    }
}
