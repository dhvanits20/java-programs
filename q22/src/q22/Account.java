package q22;

public abstract class Account {
	String accountNumber;
    String holderName;
    double balance;

    Account(String accountNumber, String holderName, double balance) throws InvalidBalanceException {
        if (balance < 0) {
            throw new InvalidBalanceException("Balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    abstract double calculateInterest();
}
