import java.util.*;
 
public class Payroll {
    private String employeeName;
    private int employeeID;
    private double hourlyPayRate;
    private double hoursWorked;
 
    // Constructor to initialize employee's name and ID
    public Payroll(String name, int id) {
        employeeName = name;
        employeeID = id;
    }
 
    // Accessor and mutator methods for hourlyPayRate and hoursWorked
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
 
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
 
    public double getHoursWorked() {
        return hoursWorked;
    }
 
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
 
    // Method to calculate gross pay
    public double calculateGrossPay() {
        return hourlyPayRate * hoursWorked;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();
 
        System.out.print("Enter employee's ID: ");
        int id = scanner.nextInt();
 
        Payroll payroll = new Payroll(name, id);
 
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();
        payroll.setHourlyPayRate(hourlyPayRate);
 
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();
        payroll.setHoursWorked(hoursWorked);
 
        System.out.println("Gross pay earned: $" + payroll.calculateGrossPay());
 
        scanner.close();
    }
}