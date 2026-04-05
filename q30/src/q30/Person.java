package q30;

import java.util.Scanner;

public class Person {
	protected String personId,name,address,department,phoneNumber;

    public void getPersonData(Scanner sc) {
        System.out.print("Enter ID: ");
        personId = sc.next();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        phoneNumber = sc.next();
    }

    public void printPersonData() {
        System.out.println("ID: " + personId + " | Name: " + name);
        System.out.println("Dept: " + department + " | Phone: " + phoneNumber + " | Address: " + address);
    }
}
