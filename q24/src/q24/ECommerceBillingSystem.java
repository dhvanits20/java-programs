package q24;

import java.util.Scanner;

public class ECommerceBillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products in cart: ");
        int n = sc.nextInt();
        Product[] cart = new Product[n];
        int count = 0;
        double totalBill = 0;

        while (count < n) {
            System.out.println("\nProduct " + (count + 1) + ":");
            try {
                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Product Name: ");
                String name = sc.next();
                System.out.print("Enter Base Price: ");
                double price = sc.nextDouble();
                System.out.print("Category (1 for Electronics, 2 for Grocery, 3 for Clothing): ");
                int type = sc.nextInt();

                if (type == 1) {
                    cart[count] = new Electronics(id, name, price);
                } else if (type == 2) {
                    cart[count] = new Grocery(id, name, price);
                } else {
                    cart[count] = new Clothing(id, name, price);
                }
                
                totalBill += cart[count].calculateFinalPrice();
                count++;
            } catch (InvalidPriceException e) {
                System.out.println("Error adding product: " + e.getMessage());
            }
        }

        System.out.println("\n--- Final Bill Breakdown ---");
        for (Product p : cart) {
            System.out.println(p.name + " | Base: " + p.price + " | Tax: " + p.calculateTax() + " | Final: " + p.calculateFinalPrice());
        }
        System.out.println("----------------------------");
        System.out.println("Total Amount Payable: Rs. " + totalBill);
        sc.close();
	}

}
