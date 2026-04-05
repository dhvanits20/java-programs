package q26;

import java.util.Scanner;

public class ExamCertificationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of exam records to process: ");
        int n = sc.nextInt();
        Exam[] exams = new Exam[n];
        int count = 0;

        while (count < n) {
            System.out.println("\nRecord " + (count + 1) + ":");
            try {
                System.out.print("Enter Subject: ");
                String subject = sc.next();
                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();
                System.out.print("Exam Type (1 for MCQ, 2 for Practical): ");
                int type = sc.nextInt();

                if (type == 1) {
                    exams[count] = new MCQExam(subject, marks);
                } else {
                    exams[count] = new PracticalExam(subject, marks);
                }
                count++;
            } catch (InvalidMarksException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n--- Certification Results ---");
        for (Exam exam : exams) {
            if (exam.calculateResult()) {
                System.out.println("Status: Pass | Marks: " + exam.marks);
                if (exam instanceof Certifiable) {
                    ((Certifiable) exam).issueCertificate();
                }
            } else {
                System.out.println("Status: Fail | Marks: " + exam.marks);
                System.out.println("No certificate issued.");
            }
            System.out.println("-");
        }
        sc.close();
	}

}
