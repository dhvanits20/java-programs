package q10;

public class PersonalLoan extends Loan {

	PersonalLoan(String applicantName, double loanAmount) {
        super(applicantName, loanAmount);
    }

    @Override
    double calculateInterest() {
        return loanAmount * 0.12;
    }
}
