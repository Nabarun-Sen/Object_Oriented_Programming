class Student{
    int roll;

    void setRoll(int r){
        roll = r;
    }

    int getRoll(){
        return roll;
    }
}
class Test extends Student{
    double sub1 , sub2;

    void setMarks(double s1 , double s2){
        sub1 = s1;
        sub2 = s2;
    }
    void getMarks(){
        System.out.println("Marks in Sub1 : " + sub1);
        System.out.println("mark in sub2 : " + sub2);
    }
}

interface Attendence{
    int Atten =  12;
    void getAttendance();

}

class Result extends Test implements Attendence{
    double total;
    public void getAttendance()
    {System.out.println("Attendance : " + Atten);}
    public void getTotal() {
        total = sub1+sub2+Atten;
        System.out.println("Total : " + total);
    }
    public void display(){
        System.out.println("RollNumber : " + getRoll());
        getMarks();
        getAttendance();
        getTotal();
    }

}

public class Stu {
    public static void main(String[] args) {
        Result rs = new Result();

        rs.setRoll(134);
        rs.setMarks(67, 84);
        rs.display();
    }
}
