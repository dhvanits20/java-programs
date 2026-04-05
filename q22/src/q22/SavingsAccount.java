package q22;

public class SavingsAccount extends Account implements Insurable {
	SavingsAccount(String accountNumber, String holderName, double balance) throws InvalidBalanceException {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }

    @Override
    public double calculateInsurance() {
        return balance * 0.02;
    }
}
