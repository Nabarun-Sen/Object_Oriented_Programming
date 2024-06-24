interface speaker{
    void speak();
}
class Lecturer implements speaker{

    public void speak(){
        System.out.println("Hello I am a Lecturer");
    }
}
class Politician implements speaker{
    public void speak(){
        System.out.println("Bharat is the new India");
    }
}
public class Politics {
    public static void main(String[] args) {
        speaker s1 = new Lecturer();
        speaker s2 = new Politician();
        s1.speak();
        s2.speak();
        
    }
}
