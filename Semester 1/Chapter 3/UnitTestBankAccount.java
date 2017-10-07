public class UnitTestBankAccount {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(600);

		account1.deposit(100);
		System.out.println("Balance predicted for first account: 100.")
		System.out.println("Actual Balance: " + account1.getBalance());
		account2.withdraw(400);
		System.out.println("Balance predicted for second account: 200.")
		System.out.println("Actual Balance: " + account2.getBalance());
	}
}
