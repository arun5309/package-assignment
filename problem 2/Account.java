package Balance;

public class Account {
    private double balance; // dollars

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void Display_Balance() {
        System.out.println("Current balance is: $" + balance);
    }
}
