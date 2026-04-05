package q18;

import java.util.Scanner;

public class ExamResultSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Exam[] students = new Exam[n];
        int count = 0;

        while (count < n) {
            System.out.println("\nEnter details for student " + (count + 1) + ":");
            try {
                System.out.print("Enter Student Name: ");
                String name = sc.next();
                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                students[count] = new Exam(name, marks);
                count++;
            } catch (InvalidMarksException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n--- Exam Results ---");
        for (Exam student : students) {
            System.out.println(student.studentName + " - Marks: " + student.marks + " | Result: " + student.calculateResult());
        }
        sc.close();
	}

}
