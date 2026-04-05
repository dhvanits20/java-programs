package q12;

import java.util.Scanner;

public class AdmissionSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students to admit: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            try {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                students[i] = new Student(id, name, age, marks);
                System.out.println("Student admitted successfully.");
            } catch (InvalidAgeException e) {
                System.out.println("Admission Failed: " + e.getMessage());
            } catch (InvalidMarksException e) {
                System.out.println("Admission Failed: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input format.");
                sc.nextLine(); 
            }
        }
        sc.close();
	}

}
