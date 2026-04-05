package q30;

import java.util.Scanner;

public class Faculty extends Person {
	private String degree,designation,specialization;
	private int experience;

    public void getFacultyData(Scanner sc) {
        getPersonData(sc);
        sc.nextLine();
        System.out.print("Enter Degree: ");
        degree = sc.nextLine();
        System.out.print("Enter Designation: ");
        designation = sc.nextLine();
        System.out.print("Enter Specialization: ");
        specialization = sc.nextLine();
        System.out.print("Enter Experience (years): ");
        experience = sc.nextInt();
    }

    public void printFacultyData() {
        System.out.println("\n--- Faculty Profile ---");
        printPersonData();
        System.out.println("Degree: " + degree + " | Designation: " + designation);
        System.out.println("Specialization: " + specialization + " | Experience: " + experience + " years");
    }
}
