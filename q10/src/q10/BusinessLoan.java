package q10;

public class BusinessLoan extends Loan {

	BusinessLoan(String applicantName, double loanAmount) {
        super(applicantName, loanAmount);
    }

    @Override
    double calculateInterest() {
        return loanAmount * 0.15;
    }
}
