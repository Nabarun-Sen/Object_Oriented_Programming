abstract class shape{
    abstract void calculateArea();
}

class circle extends shape{
    int radius;
    circle(int r){radius = r;}

    public void calculateArea(){
        System.out.println("area is : " +(Math.PI*radius*radius));
    }
}

public class Area {
    public static void main(String[] args) {
        circle c = new circle(24);
        c.calculateArea();
        
    }
}
