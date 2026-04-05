package q2;

public class SavingsAccount extends Account {

	SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04; // 4% interest
        balance += interest;
        System.out.println(holderName + " Savings Interest Added: " + interest + ". Balance: " + balance);
    }
}
