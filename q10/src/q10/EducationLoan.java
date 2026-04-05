package q10;

public class EducationLoan extends Loan {

	EducationLoan(String applicantName, double loanAmount) {
        super(applicantName, loanAmount);
    }

    @Override
    double calculateInterest() {
        return loanAmount * 0.08;
    }
}
