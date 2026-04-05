package q8;

import java.util.Scanner;

public class VehicleInsuranceSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of vehicles: ");
        int n = sc.nextInt();
        Vehicle[] vehicles = new Vehicle[n];
        double totalPremium = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Vehicle Number: ");
            String vNum = sc.next();
            System.out.print("Enter Vehicle Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Type (1: Car, 2: Bike, 3: Truck): ");
            int type = sc.nextInt();

            if (type == 1) {
                vehicles[i] = new Car(vNum, price);
            } else if (type == 2) {
                vehicles[i] = new Bike(vNum, price);
            } else {
                vehicles[i] = new Truck(vNum, price);
            }

            double premium = vehicles[i].calculateInsurance();
            System.out.println("Premium for " + vNum + ": Rs. " + premium);
            totalPremium += premium;
        }

        System.out.println("Total Insurance Collection: Rs. " + totalPremium);
        sc.close();
	}

}
