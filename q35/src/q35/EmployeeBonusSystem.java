package q35;

import java.util.Scanner;

public class EmployeeBonusSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        BaseEmployee[] staff = new BaseEmployee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Type (1 for Manager, 2 for Developer): ");
            int type = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            if (type == 1) {
                staff[i] = new BranchManager(name, salary);
            } else {
                staff[i] = new TechDeveloper(name, salary);
            }
        }

        System.out.println("\n--- Employee Bonus Report ---");
        for (BaseEmployee e : staff) {
            e.displayProfile();
        }
        sc.close();
	}

}
