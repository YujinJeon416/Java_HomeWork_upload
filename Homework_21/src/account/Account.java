package account;

/*
 * 고정금리의계좌를생성하여현재잔액을기준으로이자를계산하는프로그램을작성한다.
 * 사용데이터Account(계좌번호): 441-0290-1203, balance(잔액): 500000원, interestRate(이율): 7.3%
 */

public class Account {
	private String account;
	private int balance;
	private double interestRate;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return balance * (interestRate/100.0);
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		this.balance -= money;
	}
	public void showAccount() {
		System.out.println("계좌정보: "+ account + " 현재잔액: " + balance);
	}
	public void showInterest() {
		System.out.println("이자: "+ calculateInterest());
		
	}
	public String accountInfo() {
		return "계좌번호: "+ account + " 잔액: " + balance + "원"
				+ " 이자율: "+ interestRate+"%";
	}

	public String getAccount() { return account; } 
	public void setAccount(String account) { this.account = account; } 
	public int getBalance() { return balance; } 
	public void setBalance(int balance) { this.balance = balance; } 
	public double getInterestRate() { return interestRate; } 
	public void setInterestRate(double interestRate) { this.interestRate = interestRate; } 
}
