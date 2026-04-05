package q36;

import java.util.Scanner;

public class InstitutionalDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of staff records to register: ");
        int n = sc.nextInt();
        Staff[] database = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Role (1 for Teacher, 2 for Officer): ");
            int role = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Staff Code: ");
            String code = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            if (role == 1) {
                System.out.print("Enter Subject: ");
                String subject = sc.nextLine();
                System.out.print("Enter Publication: ");
                String publication = sc.nextLine();
                database[i] = new Teacher(code, name, subject, publication);
            } else {
                System.out.print("Enter Grade: ");
                String grade = sc.nextLine();
                database[i] = new Officer(code, name, grade);
            }
        }

        System.out.println("\n--- Database Retrieval ---");
        for (Staff s : database) {
            if (s instanceof Teacher) {
                ((Teacher) s).retrieveTeacherInfo();
            } else if (s instanceof Officer) {
                ((Officer) s).retrieveOfficerInfo();
            }
        }
        sc.close();
	}

}
