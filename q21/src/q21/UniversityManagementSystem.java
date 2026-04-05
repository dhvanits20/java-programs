package q21;

import java.util.Scanner;

public class UniversityManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of records to manage: ");
        int n = sc.nextInt();
        Person[] people = new Person[n];
        int count = 0;

        while (count < n) {
            System.out.println("\nRecord " + (count + 1) + ":");
            try {
                System.out.print("Enter Type (1 for Student, 2 for Faculty): ");
                int type = sc.nextInt();
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Name: ");
                String name = sc.next();

                if (type == 1) {
                    System.out.print("Enter Course Fee: ");
                    double fee = sc.nextDouble();
                    System.out.print("Enter Scholarship Amount: ");
                    double scholarship = sc.nextDouble();
                    people[count] = new Student(id, name, fee, scholarship);
                } else {
                    System.out.print("Enter Basic Salary: ");
                    double salary = sc.nextDouble();
                    System.out.print("Enter Bonus: ");
                    double bonus = sc.nextDouble();
                    people[count] = new Faculty(id, name, salary, bonus);
                }
                count++;
            } catch (InvalidAmountException e) {
                System.out.println("Error creating record: " + e.getMessage());
            } finally {
                System.out.println("Processed input for record entry.");
            }
        }

        System.out.println("\n--- University Financial Report ---");
        for (Person p : people) {
            p.displayDetails();
            if (p instanceof Payable) {
                System.out.println("Calculated Payment: Rs. " + ((Payable) p).calculatePayment());
            }
            System.out.println("-");
        }
        sc.close();
	}

}
