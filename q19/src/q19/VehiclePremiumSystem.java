package q19;

import java.util.Scanner;

public class VehiclePremiumSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles to insure: ");
        int n = sc.nextInt();
        Vehicle[] vehicles = new Vehicle[n];
        int count = 0;
        double totalPremium = 0;

        while (count < n) {
            System.out.println("\nVehicle " + (count + 1) + ":");
            try {
                System.out.print("Enter Vehicle Number: ");
                String vNum = sc.next();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                System.out.print("Vehicle Type (1 for Car, 2 for Bike): ");
                int type = sc.nextInt();

                if (type == 1) {
                    vehicles[count] = new Car(vNum, price);
                } else {
                    vehicles[count] = new Bike(vNum, price);
                }

                double premium = vehicles[count].calculatePremium();
                System.out.println("Premium for " + vNum + ": Rs. " + premium);
                totalPremium += premium;
                count++;
            } catch (InvalidPriceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\nTotal Insurance Collection: Rs. " + totalPremium);
        sc.close();
	}

}
