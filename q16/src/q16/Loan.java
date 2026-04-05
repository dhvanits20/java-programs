package q16;

public abstract class Loan {
	String applicantName;
    double loanAmount;

    Loan(String applicantName, double loanAmount) throws LoanLimitExceededException {
        if (loanAmount > 1000000) {
            throw new LoanLimitExceededException("Requested amount " + loanAmount + " exceeds maximum limit of 10,00,000");
        }
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
    }

    abstract double calculateInterest();

    double calculateTotalPayable() {
        return loanAmount + calculateInterest();
    }
}
