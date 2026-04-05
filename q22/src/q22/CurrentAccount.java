package q22;

public class CurrentAccount extends Account implements Insurable {
	CurrentAccount(String accountNumber, String holderName, double balance) throws InvalidBalanceException {
        super(accountNumber, holderName, balance);
    }

    @Override
    double calculateInterest() {
        return 0;
    }

    @Override
    public double calculateInsurance() {
        return balance * 0.02;
    }
}
