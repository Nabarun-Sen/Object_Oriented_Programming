public class Complex {
    private double real, imaginary;
 
    // Constructor to initialize the complex number
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
 
    // Add operation
    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }
 
    // Subtract operation
    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }
 
    // Check if two complex numbers are equal
    public boolean isEqual(Complex other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }
 
    public static void main(String[] args) {
        Complex complex1 = new Complex(3.0, 4.0);
        Complex complex2 = new Complex(1.5, 2.5);
 
        Complex sum = complex1.add(complex2);
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
 
        Complex difference = complex1.subtract(complex2);
        System.out.println("Difference: " + difference.real + " + " + difference.imaginary + "i");
 
        boolean isEqual = complex1.isEqual(complex2);
        System.out.println("Are the complex numbers equal? " + isEqual);
    }
}