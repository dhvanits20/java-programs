package q2;

public abstract class Account {

	String accountNumber;
    String holderName;
    double balance;

    Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(holderName + " deposited: " + amount + ". New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println(holderName + " attempted to withdraw " + amount + " - Insufficient funds!");
        }
    }
    abstract void calculateInterest();

}