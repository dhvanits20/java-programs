package q5;

import java.util.Scanner;

public class HospitalBillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        Patient[] patients = new Patient[2];
        double totalHospitalIncome = 0;

        System.out.println("--- Enter Patient Details ---");
        for (int i = 0; i < patients.length; i++) {
            System.out.println("\nPatient " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Ward Type (1 for General, 2 for ICU): ");
            int type = sc.nextInt();

            System.out.print("Enter number of days admitted: ");
            int days = sc.nextInt();

            double billAmount = 0;
            if (type == 1) {
                patients[i] = new GeneralWard(id, name);
                billAmount = patients[i].calculateBill(days);
            } else if (type == 2) {
                patients[i] = new ICU(id, name);
                billAmount = patients[i].calculateBill(days);
            } else {
                System.out.println("Invalid type. Defaulting to General Ward.");
                patients[i] = new GeneralWard(id, name);
                billAmount = patients[i].calculateBill(days);
            }

            System.out.println("Bill for " + name + ": Rs. " + billAmount);
            totalHospitalIncome += billAmount;
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Total Hospital Income: Rs. " + totalHospitalIncome);
        sc.close();
	}

}
