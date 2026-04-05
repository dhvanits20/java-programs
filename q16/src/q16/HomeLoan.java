package q16;

public class HomeLoan extends Loan {
	HomeLoan(String applicantName, double loanAmount) throws LoanLimitExceededException {
        super(applicantName, loanAmount);
    }

    @Override
    double calculateInterest() {
        return loanAmount * 0.08;
    }
}
