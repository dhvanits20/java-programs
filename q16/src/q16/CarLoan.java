package q16;

public class CarLoan extends Loan {
	CarLoan(String applicantName, double loanAmount) throws LoanLimitExceededException {
        super(applicantName, loanAmount);
    }

    @Override
    double calculateInterest() {
        return loanAmount * 0.10;
    }
}
