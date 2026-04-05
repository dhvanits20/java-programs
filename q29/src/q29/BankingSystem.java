package q29;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts to create: ");
        int n = sc.nextInt();
        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            accounts[i] = new Account();
            accounts[i].getAccountDetails(sc);
        }

        System.out.println("\n--- Account Operations ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nOperating on Account " + (i + 1) + ":");
            accounts[i].printAccountDetails();
            System.out.print("Enter amount to deposit: ");
            accounts[i].deposit(sc.nextDouble());
            System.out.print("Enter amount to withdraw: ");
            accounts[i].withdraw(sc.nextDouble());
        }
        sc.close();
	}

}
