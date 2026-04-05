package q2;

public class CurrentAccount extends Account {

	CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        if (balance < 1000) {
            balance -= 500;
            System.out.println(holderName + " Current Account Penalty Deducted: 500. Balance: " + balance);
        } else {
            System.out.println(holderName + " Current Account - No penalty applied. Balance: " + balance);
        }
    }
}
