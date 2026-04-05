package q13;

import java.util.Scanner;

public class OnlineShoppingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products to register: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Stock: ");
            int stock = sc.nextInt();
            products[i] = new Product(id, name, price, stock);
        }

        System.out.print("\nEnter number of purchase transactions to simulate: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("\nTransaction " + (i + 1));
            System.out.print("Enter Product ID to purchase: ");
            int targetId = sc.nextInt();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            boolean found = false;
            for (Product p : products) {
                if (p != null && p.productId == targetId) {
                    found = true;
                    try {
                        p.purchase(qty);
                    } catch (OutOfStockException e) {
                        System.out.println("Transaction Failed: " + e.getMessage());
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Error: Product ID not found.");
            }
        }
        sc.close();
	}

}
