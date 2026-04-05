package q11;

import java.util.Scanner;

public class ATMSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts to create: ");
        int n = sc.nextInt();
        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Account Number: ");
            String accNo = sc.next();
            System.out.print("Enter Holder Name: ");
            String name = sc.next();
            System.out.print("Enter Initial Balance: ");
            double bal = sc.nextDouble();
            accounts[i] = new Account(accNo, name, bal);
        }

        System.out.println("\n--- Initiating Transactions ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nAccount: " + accounts[i].accountNumber);
            try {
                System.out.print("Enter deposit amount: ");
                double dep = sc.nextDouble();
                accounts[i].deposit(dep);

                System.out.print("Enter withdrawal amount: ");
                double with = sc.nextDouble();
                accounts[i].withdraw(with);
            } catch (InsufficientBalanceException e) {
                System.out.println("Transaction Error: " + e.getMessage());
            } finally {
                System.out.println("Transaction process completed for " + accounts[i].holderName);
            }
        }
        sc.close();
	}

}
