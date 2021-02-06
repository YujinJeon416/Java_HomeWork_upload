package exception;

public class AccountTest {
	public static void main(String[] args) {
		int input = 0;
		int output = 0;
		Account account = 
				new Account("441-0290-1203",500000,7.3);
		System.out.println("계좌번호 : " + account.getAccount() + 
				" 잔고 : " + account.getBalance() + 
				" 이자율 : " + account.getInterestRate());
		
		try{
			input = -10;
			account.deposit(input);
		}catch(Exception e) {
			if(input < 0) {
				System.out.println("입금금액이 0보다 적습니다.");
			}
		}
		
		try {
			output = 600000;
			account.withdraw(output);
		}catch(Exception e) {
			if(account.getBalance() < 0) {
				System.out.println("출금액이 0보다 적습니다.");
			}else if(output > account.getBalance()) {
				System.out.println("출금금액이 현재 잔액보다 많습니다.");
			}
		}
		System.out.println("이자 : " + account.calculateInterest());
	}
}
