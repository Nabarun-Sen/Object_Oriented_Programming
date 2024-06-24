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

class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double annualProductionBonus;
    public ShiftSupervisor(String name, String empNumber, String hireDate, double annualSalary, double annualProductionBonus) {
        super(name, empNumber, hireDate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }
}

public class Supervise {
    public static void main(String[] args) {
        ShiftSupervisor supervisor = new ShiftSupervisor("Nabarun Sen", "938-B", "22-08-2023", 600000, 50000);
        System.out.println("Employee Name: " + supervisor.getName());
        System.out.println("Employee Number: " + supervisor.getEmpNumber());
        System.out.println("Hire Date: " + supervisor.getHireDate());
        System.out.println("Annual Salary: " + supervisor.getAnnualSalary());
        System.out.println("Annual Production Bonus: " + supervisor.getAnnualProductionBonus());
    }
}