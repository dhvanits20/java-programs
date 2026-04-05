package q28;

import java.util.Scanner;

public class Student {
	private int admissionNumber;
    private String name;
    private int studentClass;
    private int rollNumber;

    public void getdata(Scanner sc) {
        System.out.print("Enter Admission Number: ");
        admissionNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Class: ");
        studentClass = sc.nextInt();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
    }

    public void showdata() {
        System.out.println("Admission No: " + admissionNumber + " | Name: " + name + 
                           " | Class: " + studentClass + " | Roll No: " + rollNumber);
    }
}
