package q27;

public class HomeLoan extends Loan implements RiskAssessment {
	HomeLoan(String applicantName, double loanAmount) throws InvalidLoanAmountException {
        super(applicantName, loanAmount);
    }

    @Override
    double calculateInterest() {
        return loanAmount * 0.08;
    }

    @Override
    public double calculateRisk() {
        if (loanAmount > 500000) {
            return loanAmount * 0.02;
        }
        return 0;
    }
}
