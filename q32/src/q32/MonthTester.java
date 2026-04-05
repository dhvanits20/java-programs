package q32;

import java.util.Scanner;

public class MonthTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a month number for Month 1: ");
        int m1 = sc.nextInt();
        Month month1 = new Month(m1);
        sc.nextLine();

        System.out.print("Enter a month name for Month 2: ");
        String m2 = sc.nextLine();
        Month month2 = new Month(m2);

        System.out.println("\nMonth 1 is: " + month1.toString() + " (" + month1.getMonthNumber() + ")");
        System.out.println("Month 2 is: " + month2.toString() + " (" + month2.getMonthNumber() + ")");

        System.out.println("Month 1 > Month 2: " + month1.greaterThan(month2));
        System.out.println("Month 1 < Month 2: " + month1.lessThan(month2));
        sc.close();
	}

}
