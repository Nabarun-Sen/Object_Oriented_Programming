public class Box {
    private int width;
    private int height;
    private int depth;
 
    // Constructor to initialize the box dimensions
    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
 
    // Calculate volume
    public double volume() {
        return width * height * depth;
    }
 
    // Display box details
    public void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
        System.out.println("Volume: " + volume());
    }
 
    // Compare volumes of two boxes and return the one with the greater volume
    public static Box compareVolume(Box box1, Box box2) {
        if (box1.volume() > box2.volume()) {
            return box1;
        } else {
            return box2;
        }
    }
 
    public static void main(String[] args) {
        Box box1 = new Box(5, 6, 7);
        Box box2 = new Box(4, 8, 10);
        Box box3 = new Box(6, 6, 6);
 
        System.out.println("Details of the box with the highest volume:");
        Box highestVolumeBox = compareVolume(box1, compareVolume(box2, box3));
        highestVolumeBox.display();
    }
}