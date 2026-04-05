package q7;

import java.util.Scanner;

public class CoursePortalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        Course[] courses = new Course[4];
        double totalIncome = 0;

        System.out.println("--- Enter Course Enrollments ---");
        for (int i = 0; i < courses.length; i++) {
            System.out.println("\nEnrollment " + (i + 1));
            System.out.print("Course Code: ");
            String code = sc.next();

            System.out.print("Base Fee: ");
            double fee = sc.nextDouble();

            System.out.print("Course Type (1 for Offline, 2 for Online): ");
            int type = sc.nextInt();

            if (type == 1) {
                courses[i] = new OfflineCourse(code, fee);
            } else {
                System.out.print("Enter Platform Fee: ");
                double platformFee = sc.nextDouble();
                courses[i] = new OnlineCourse(code, fee, platformFee);
            }

            double finalFee = courses[i].calculateTotalFee();
            totalIncome += finalFee;
            
            System.out.println("Student charged: Rs. " + finalFee);
            courses[i].issueCertificate();
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Total Portal Income: Rs. " + totalIncome);
        sc.close();
	}

}
