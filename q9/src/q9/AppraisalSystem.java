package q9;

import java.util.Scanner;

public class AppraisalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Rating (1-5): ");
            int rating = sc.nextInt();
            System.out.print("Enter Role (1: HR, 2: Developer): ");
            int role = sc.nextInt();
            
            if (role == 1) {
                employees[i] = new HR(id, name, rating);
            } else {
                employees[i] = new Developer(id, name, rating);
            }
        }

        System.out.println("\n--- Appraisal Report ---");
        double defaultBaseSalary = 50000; 
        for (Employee emp : employees) {
            double bonus = emp.calculateBonus(defaultBaseSalary);
            System.out.println(emp.name + " (ID: " + emp.id + ") - Rating: " + emp.rating + " | Bonus: Rs. " + bonus);
        }
        sc.close();
	}

}
