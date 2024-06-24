class Employee {
    private String name;
    private String empNumber;
    private String hireDate;

    public Employee(String name, String empNumber, String hireDate) {
        this.name = name;
        this.empNumber = empNumber;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}

class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String name, String empNumber, String hireDate, int shift, double hourlyPayRate) {
        super(name, empNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}

public class Work {
    public static void main(String[] args) {
        ProductionWorker worker = new ProductionWorker("Nabarun Sen", "453-A", "21-08-2023", 1, 15.0);
        System.out.println("Employee Name: " + worker.getName());
        System.out.println("Employee Number: " + worker.getEmpNumber());
        System.out.println("Hire Date: " + worker.getHireDate());
        System.out.println("Shift: " + worker.getShift());
        System.out.println("Hourly Pay Rate: " + worker.getHourlyPayRate());
    }
}