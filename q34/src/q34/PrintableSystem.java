package q34;

import java.util.Scanner;

public class PrintableSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of printable items to queue: ");
        int n = sc.nextInt();
        Printable[] printQueue = new Printable[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Type (1 for Document, 2 for Photo): ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author: ");
                String author = sc.nextLine();
                printQueue[i] = new Document(title, author);
            } else {
                System.out.print("Enter Resolution (e.g., 1920x1080): ");
                String res = sc.nextLine();
                System.out.print("Enter Size in MB: ");
                double size = sc.nextDouble();
                printQueue[i] = new Photo(res, size);
            }
        }

        System.out.println("\n--- Print Queue Details ---");
        for (Printable item : printQueue) {
            item.printDetails();
        }
        sc.close();
	}

}
