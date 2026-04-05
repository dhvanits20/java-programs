package q27;

public abstract class Loan {
	String applicantName;
    double loanAmount;

    Loan(String applicantName, double loanAmount) throws InvalidLoanAmountException {
        if (loanAmount < 0) {
            throw new InvalidLoanAmountException("Loan amount cannot be negative.");
        }
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
    }

    abstract double calculateInterest();
}
