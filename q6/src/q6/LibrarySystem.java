package q6;

import java.util.Scanner;

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        LibraryItem[] items = new LibraryItem[6];
        double totalFine = 0;

        System.out.println("--- Enter Library Return Details ---");
        for (int i = 0; i < items.length; i++) {
            System.out.println("\nItem " + (i + 1));
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Item Type (1: PrintedBook, 2: EBook, 3: Journal): ");
            int type = sc.nextInt();

            System.out.print("Days Late (0 if not late): ");
            int daysLate = sc.nextInt();

            if (type == 1) {
                items[i] = new PrintedBook(id, title);
            } else if (type == 2) {
                items[i] = new EBook(id, title);
            } else {
                items[i] = new Journal(id, title);
            }

            if (daysLate > 0) {
                double fine = items[i].calculateFine(daysLate);
                System.out.println("Fine for '" + title + "': Rs. " + fine);
                totalFine += fine;
            } else {
                System.out.println("No fine for '" + title + "'.");
            }
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Total Fines Collected: Rs. " + totalFine);
        sc.close();
	}

}
