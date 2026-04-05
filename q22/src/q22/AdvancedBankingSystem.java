package q22;

import java.util.Scanner;

public class AdvancedBankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts to create: ");
        int n = sc.nextInt();
        Account[] accounts = new Account[n];
        int count = 0;

        while (count < n) {
            System.out.println("\nAccount " + (count + 1) + ":");
            try {
                System.out.print("Enter Account Number: ");
                String accNo = sc.next();
                System.out.print("Enter Holder Name: ");
                String name = sc.next();
                System.out.print("Enter Balance: ");
                double balance = sc.nextDouble();
                System.out.print("Account Type (1 for Savings, 2 for Current): ");
                int type = sc.nextInt();

                if (type == 1) {
                    accounts[count] = new SavingsAccount(accNo, name, balance);
                } else {
                    accounts[count] = new CurrentAccount(accNo, name, balance);
                }
                count++;
            } catch (InvalidBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n--- Financial Report ---");
        for (Account acc : accounts) {
            System.out.println("Account: " + acc.accountNumber + " | Holder: " + acc.holderName);
            System.out.println("Base Balance: Rs. " + acc.balance);
            System.out.println("Interest: Rs. " + acc.calculateInterest());
            if (acc instanceof Insurable) {
                System.out.println("Insurance Premium: Rs. " + ((Insurable) acc).calculateInsurance());
            }
            System.out.println("-");
        }
        sc.close();
	}

}
