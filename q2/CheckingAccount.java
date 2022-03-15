package lab8.q2;

public class CheckingAccount {

	private int accountNumber;
	private double balance;

	public CheckingAccount(int accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Deposit cannot be lesser than 0");
		} else {
			this.balance += amount;
		}
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (this.balance - amount < 0)
			throw new InsufficientFundsException(Math.abs(this.balance - amount));
		this.balance -= amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

}
