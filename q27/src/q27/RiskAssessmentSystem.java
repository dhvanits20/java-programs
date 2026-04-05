package q27;

import java.util.Scanner;

public class RiskAssessmentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of loan applications: ");
        int n = sc.nextInt();
        Loan[] loans = new Loan[n];
        int count = 0;

        while (count < n) {
            System.out.println("\nApplication " + (count + 1) + ":");
            try {
                System.out.print("Enter Applicant Name: ");
                String name = sc.next();
                System.out.print("Enter Loan Amount: ");
                double amount = sc.nextDouble();
                System.out.print("Loan Type (1 for Home Loan, 2 for Business Loan): ");
                int type = sc.nextInt();

                if (type == 1) {
                    loans[count] = new HomeLoan(name, amount);
                } else {
                    loans[count] = new BusinessLoan(name, amount);
                }
                count++;
            } catch (InvalidLoanAmountException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n--- Loan Processing Report ---");
        for (Loan loan : loans) {
            double baseInterest = loan.calculateInterest();
            double riskFactor = 0;
            
            if (loan instanceof RiskAssessment) {
                riskFactor = ((RiskAssessment) loan).calculateRisk();
            }
            
            double totalPayable = loan.loanAmount + baseInterest + riskFactor;

            System.out.println("Applicant: " + loan.applicantName);
            System.out.println("Principal: Rs. " + loan.loanAmount);
            System.out.println("Base Interest: Rs. " + baseInterest);
            System.out.println("Risk Surcharge: Rs. " + riskFactor);
            System.out.println("Total Payable Amount: Rs. " + totalPayable);
            System.out.println("-");
        }
        sc.close();
	}

}
