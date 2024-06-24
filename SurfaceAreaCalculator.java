import java.lang.Math;

class Figure {
    public double surfaceArea() {
        return 0;
    }
}

class Cube extends Figure {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double surfaceArea() {
        return 6 * sideLength * sideLength;
    }
}

class Cylinder extends Figure {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
}

class Sphere extends Figure {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}

public class SurfaceAreaCalculator {
    public static void main(String[] args) {
        Figure cube = new Cube(5);
        Figure cylinder = new Cylinder(3, 7);
        Figure sphere = new Sphere(4);

        System.out.println("Surface area of cube: " + cube.surfaceArea());
        System.out.println("Surface area of cylinder: " + cylinder.surfaceArea());
        System.out.println("Surface area of sphere: " + sphere.surfaceArea());
    }
}