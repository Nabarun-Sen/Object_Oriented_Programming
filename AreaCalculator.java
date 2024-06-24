class Square {
    private double side;
 
    // Parameterized constructor for Square
    public Square(double side) {
        this.side = side;
    }
 
    // Method to calculate area of the square
    public double calculateArea() {
        return side * side;
    }
}
 
class Rectangle {
    private double length;
    private double width;
 
    // Parameterized constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
 
    // Method to calculate area of the rectangle
    public double calculateArea() {
        return length * width;
    }
}
 
public class AreaCalculator {
    public static void main(String[] args) {
        // Create a square object with side 5
        Square square = new Square(5);
        double squareArea = square.calculateArea();
        System.out.println("Area of the square: " + squareArea);
 
        // Create a rectangle object with length 8 and width 6
        Rectangle rectangle = new Rectangle(8, 6);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}