package account;

public class AccountTest2 {
	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		for(int i =0; i<accounts.length; i++) {
			accounts[i] = new Account("221-0101-211"+(i+1), 100000, 4.5);
			System.out.println(accounts[i].accountInfo());
			accounts[i].setInterestRate(3.7);
		}

		for(int i =0; i<accounts.length; i++) {
			System.out.printf("%s 이자: %.0f 원\n", accounts[i].accountInfo(), accounts[i].calculateInterest());
		}
		
	}
}
