
abstract class Accounts{
    double  balance;
    long accountNo;
    String HolderName;

    public Accounts(double b , long a , String h){
        balance = b;
        accountNo = a;
        HolderName = h;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance !");
        }
        else {
            balance -= amount;
            System.out.println(amount + " withdrawn !");
        }
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited Amount : " + amount );
    }

    public abstract void display();
}

class SavingsAccount extends Accounts{
    double rate_of_interest;
    public SavingsAccount(double b , long a, String h , double r){
        super(b , a , h);
        rate_of_interest = r;

    }

    public void display(){
        System.out.println("Rate of Interest : " + rate_of_interest);
        System.out.println("Balance : "+ balance);
    }
}
class CurrentAccount extends Accounts{
    double overDraftLimit;
    public CurrentAccount(double b, long a, String h , double o) {
        super(b, a, h);
        overDraftLimit = o;
    }

    public void display(){
        System.out.println("over draft Limit : " + overDraftLimit );
    }

    
    
}

public class Account {
    public static void main(String[] args) {
        SavingsAccount sc = new SavingsAccount(0, 69696969, "Rohan Khanki", 6.9);
        CurrentAccount ca = new CurrentAccount(200010, 544738473, "nulla Ranit", 120000);

        sc.deposit(1200);
        sc.withdraw(999);
        sc.display();

        ca.display();
    }
}
