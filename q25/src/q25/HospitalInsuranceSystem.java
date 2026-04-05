package q25;

import java.util.Scanner;

public class HospitalInsuranceSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients to process: ");
        int n = sc.nextInt();
        Patient[] patients = new Patient[n];
        int count = 0;

        while (count < n) {
            System.out.println("\nPatient " + (count + 1) + ":");
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Base Charge per day: ");
            double charge = sc.nextDouble();
            System.out.print("Ward Type (1 for General, 2 for ICU, 3 for Emergency): ");
            int type = sc.nextInt();

            if (type == 1) {
                patients[count] = new GeneralWard(id, name, charge);
            } else if (type == 2) {
                patients[count] = new ICU(id, name, charge);
            } else {
                patients[count] = new Emergency(id, name, charge);
            }
            count++;
        }

        System.out.println("\n--- Final Billing Report ---");
        for (Patient p : patients) {
            System.out.print("Enter number of days admitted for " + p.name + ": ");
            int days = sc.nextInt();
            
            try {
                double grossBill = p.calculateBill(days);
                double insurance = 0;
                if (p instanceof Insurable) {
                    insurance = ((Insurable) p).calculateInsuranceCoverage();
                }
                double finalPayable = grossBill - insurance;

                System.out.println("Gross Bill: Rs. " + grossBill);
                System.out.println("Insurance Deduction: Rs. " + insurance);
                System.out.println("Final Payable Amount: Rs. " + finalPayable);
                System.out.println("-");
            } catch (InvalidStayException e) {
                System.out.println("Billing Error: " + e.getMessage());
                System.out.println("-");
            }
        }
        sc.close();
	}

}
