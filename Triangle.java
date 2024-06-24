public class Triangle {
    private int base;
    private int height;
 
    // Constructor to initialize base and height
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
 
    // Method to calculate area
    public double area() {
        return 0.5 * base * height;
    }
 
    // Method to display triangle details
    public void display() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
    }
 
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[3]; // Create an array of Triangle objects
 
        triangles[0] = new Triangle(5, 7);
        triangles[1] = new Triangle(4, 9);
        triangles[2] = new Triangle(6, 5);
 
        // Find the triangle with the highest area
        int highestAreaIndex = 0;
        double highestArea = triangles[0].area();
        for (int i = 1; i < triangles.length; i++) {
            if (triangles[i].area() > highestArea) {
                highestArea = triangles[i].area();
                highestAreaIndex = i;
            }
        }
 
        System.out.println("Details of the triangle with the highest area:");
        triangles[highestAreaIndex].display();
    }
}