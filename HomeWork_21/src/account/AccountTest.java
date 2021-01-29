package account;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account("441-0290-1203", 500000, 7.3);
		account.showAccount();
		account.deposit(20000);
		account.showAccount();
		account.showInterest();
	}
}
