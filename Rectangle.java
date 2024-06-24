public class Rectangle {
    private int length;
    private int width;
 
    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
 
    // Method to calculate area
    public int calcArea() {
        return length * width;
    }
 
    // Method to display rectangle details
    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calcArea());
    }
 
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5, 3);
 
        // Display rectangle details
        rectangle.display();
    }
}