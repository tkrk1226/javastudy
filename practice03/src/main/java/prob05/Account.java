package prob05;

public class Account {
	
	private String accountNo = null;
	private double balance;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		this.balance = 0;
	}
	
	public void save(double money) {
		this.balance += money;
	}
	
	public void deposit(double money) {
		this.balance -= money;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
