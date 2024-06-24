class ProductionWorker{
    String name;
    static int count = 1;
    int id;
    double eph;
    ProductionWorker(String name , double eph){
        this.name = name;
        this.eph = eph;
        this.id = count++;
    }

    void showDetails(){
        System.out.println("name is : " + name);
        System.out.println("earning per hour is  : " + eph);
        System.out.println("id is : " + id);
    }
}

class TeamLeader extends ProductionWorker {
    double bonus;
    int trainingHours;
    TeamLeader(String name, double eph , double bonus , int trainingHours) {
        super(name, eph);
        this.bonus = bonus;
        this.trainingHours = trainingHours;
    }

    void showDetails(){
        super.showDetails();
        System.out.println("bonus is : " + bonus);
        System.out.println("required training hour is : " + trainingHours);
    }



}

public class Manager {
    public static void main(String[] args) {
        ProductionWorker p1 = new ProductionWorker("Ravi", 200);
        p1.showDetails();
        System.out.println("Details of the leader : ");
        TeamLeader p2Leader = new TeamLeader("Sabir", 250, 15000, 48);
        p2Leader.showDetails();
    }
}