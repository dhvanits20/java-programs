package q10;

import java.util.Scanner;

public class LoanApprovalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of loans: ");
        int n = sc.nextInt();
        Loan[] loans = new Loan[n];
        double totalPayableToBank = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Applicant Name: ");
            String name = sc.next();
            System.out.print("Enter Loan Amount: ");
            double amount = sc.nextDouble();
            System.out.print("Enter Loan Type (1: Personal, 2: Education, 3: Business): ");
            int type = sc.nextInt();

            if (type == 1) {
                loans[i] = new PersonalLoan(name, amount);
            } else if (type == 2) {
                loans[i] = new EducationLoan(name, amount);
            } else {
                loans[i] = new BusinessLoan(name, amount);
            }

            double payable = loans[i].calculateTotalPayable();
            System.out.println("Total Payable for " + name + ": Rs. " + payable);
            totalPayableToBank += payable;
        }

        System.out.println("Total Amount Payable across all loans: Rs. " + totalPayableToBank);
        sc.close();
	}

}
