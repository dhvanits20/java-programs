package q16;

import java.util.Scanner;

public class LoanApprovalLimitSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of loan applications to process: ");
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
                System.out.print("Loan Type (1 for Home Loan, 2 for Car Loan): ");
                int type = sc.nextInt();

                if (type == 1) {
                    loans[count] = new HomeLoan(name, amount);
                } else {
                    loans[count] = new CarLoan(name, amount);
                }
                System.out.println("Loan approved.");
                count++;
            } catch (LoanLimitExceededException e) {
                System.out.println("Application Rejected: " + e.getMessage());
                System.out.println("Please enter a new application.");
            }
        }

        System.out.println("\n--- Loan Final Report ---");
        for (Loan loan : loans) {
            System.out.println("Applicant: " + loan.applicantName + " | Principal: " + loan.loanAmount + 
                               " | Total Payable: Rs. " + loan.calculateTotalPayable());
        }
        sc.close();
	}

}
