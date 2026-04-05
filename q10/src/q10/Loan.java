package q10;

public abstract class Loan {

	String applicantName;
    double loanAmount;

    Loan(String applicantName, double loanAmount) {
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
    }

    abstract double calculateInterest();

    double calculateTotalPayable() {
        double interest = calculateInterest();
        if (loanAmount > 500000) {
            interest += loanAmount * 0.02;
        }
        return loanAmount + interest;
    }
}
