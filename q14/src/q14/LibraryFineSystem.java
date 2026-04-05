package q14;

import java.util.Scanner;

public class LibraryFineSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of library items to process: ");
        int n = sc.nextInt();
        LibraryItem[] items = new LibraryItem[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Item ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Title: ");
            String title = sc.next();
            System.out.print("Enter Type (1 for Book, 2 for Magazine): ");
            int type = sc.nextInt();

            if (type == 1) {
                items[i] = new Book(id, title);
            } else {
                items[i] = new Magazine(id, title);
            }
        }

        System.out.println("\n--- Fine Calculation ---");
        for (LibraryItem item : items) {
            System.out.print("Enter late days for " + item.title + ": ");
            int days = sc.nextInt();
            try {
                double fine = item.calculateFine(days);
                System.out.println("Fine for " + item.title + ": Rs. " + fine);
            } catch (InvalidDaysException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
	}

}
