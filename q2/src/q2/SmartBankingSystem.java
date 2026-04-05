package q2;

public class SmartBankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account[] accounts = new Account[4];
        accounts[0] = new SavingsAccount("S101", "Alice", 5000);
        accounts[1] = new CurrentAccount("C201", "Bob", 800);
        accounts[2] = new SavingsAccount("S102", "Charlie", 15000);
        accounts[3] = new CurrentAccount("C202", "Diana", 2000);

        System.out.println("--- Transaction Simulation ---");
        for (Account acc : accounts) {
            acc.deposit(200);
            acc.withdraw(100);
            acc.calculateInterest();
            System.out.println("-------------------------");
        }
	}

}
