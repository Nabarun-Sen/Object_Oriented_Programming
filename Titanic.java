class Ship{
    String name;
    String yearOfBuilt;
    
    Ship(String name , String yearOfBuilt){
        this.name = name;
        this.yearOfBuilt = yearOfBuilt;
    }

    public String toString(){
        return name + " , year of Build : " + yearOfBuilt;
    }
}

class CruiseShip extends Ship{

    int maxPassenger;

    CruiseShip(String name, String yearOfBuilt , int maxPassenger) {
        super(name, yearOfBuilt);
        this.maxPassenger = maxPassenger;
        // TODO Auto-generated constructor stub
    }
    public String toString(){
        return name +" , Passenger Capacity :  "+ Integer.toString(maxPassenger);
    }
    
}
class CargoShip extends Ship{
    int CargoCapacity;
    CargoShip(String name, String yearOfBuilt , int CargoCapacity) {
        super(name, yearOfBuilt);
        this.CargoCapacity = CargoCapacity;
        //TODO Auto-generated constructor stub
    }
    public String toString(){
        return name + " , Cargo Capacity (Tons): " + Integer.toString(CargoCapacity);
    }
    
}
public class Titanic {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("The Bengal", "2015");
        ships[1] = new CruiseShip("Totini", "2004", 40000);
        ships[2] = new CargoShip("Jw Baldev", "2010" , 5000);

        for(Ship i : ships) System.out.println(i.toString());
    }
}