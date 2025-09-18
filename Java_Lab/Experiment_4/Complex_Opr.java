import java.util.Scanner;

class Complex {
    int real;
    int imag;

    // Constructor to initialize real and imaginary parts
    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Method to subtract two complex numbers
    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex c) {
        int realPart = this.real * c.real - this.imag * c.imag;
        int imagPart = this.real * c.imag + this.imag * c.real;
        return new Complex(realPart, imagPart);
    }

    // Method to print the complex number
    void print() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}

public class Complex_Opr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first complex number
        System.out.print("Enter real part of first complex number: ");
        int real1 = scanner.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int imag1 = scanner.nextInt();
        Complex c1 = new Complex(real1, imag1);

        // Input for second complex number
        System.out.print("Enter real part of second complex number: ");
        int real2 = scanner.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int imag2 = scanner.nextInt();
        Complex c2 = new Complex(real2, imag2);

        // Perform operations
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);

        // Display results
        System.out.print("Sum: ");
        sum.print();

        System.out.print("Difference: ");
        diff.print();

        System.out.print("Product: ");
        prod.print();

        scanner.close();
    }
}
