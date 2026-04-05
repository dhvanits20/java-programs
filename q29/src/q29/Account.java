package q29;

import java.util.Scanner;

public class Account extends Customer {
	private String accountNumber,accountType;
    private double rateOfInterest,balance;

    public void getAccountDetails(Scanner sc) {
        getCustomerDetails(sc);
        System.out.print("Enter Account Number: ");
        accountNumber = sc.next();
        System.out.print("Enter Account Type: ");
        accountType = sc.next();
        System.out.print("Enter Rate of Interest: ");
        rateOfInterest = sc.nextDouble();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    public void printAccountDetails() {
        printCustomerDetails();
        System.out.println("Account No: " + accountNumber + " | Type: " + accountType);
        System.out.println("ROI: " + rateOfInterest + "% | Balance: Rs. " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs. " + amount + ". New Balance: Rs. " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew Rs. " + amount + ". New Balance: Rs. " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}
