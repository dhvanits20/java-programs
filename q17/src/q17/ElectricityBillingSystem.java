package q17;

import java.util.Scanner;

public class ElectricityBillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of consumers to process: ");
        int n = sc.nextInt();
        ElectricityBill[] bills = new ElectricityBill[n];
        int count = 0;
        double totalRevenue = 0;

        while (count < n) {
            System.out.println("\nConsumer " + (count + 1) + ":");
            try {
                System.out.print("Enter Consumer ID: ");
                String id = sc.next();
                System.out.print("Enter Units Consumed: ");
                int units = sc.nextInt();

                bills[count] = new ElectricityBill(id, units);
                double billAmount = bills[count].calculateBill();
                System.out.println("Bill for " + id + ": Rs. " + billAmount);
                totalRevenue += billAmount;
                count++;
            } catch (InvalidUnitException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter valid details for this consumer.");
            }
        }

        System.out.println("\n--- Final Revenue Report ---");
        System.out.println("Total Electricity Revenue: Rs. " + totalRevenue);
        sc.close();
	}

}
