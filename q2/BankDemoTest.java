package lab8.q2;

import java.util.Scanner;

public class BankDemoTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		CheckingAccount checkingAccount = new CheckingAccount(1234);
		boolean isWithdrawn = false;

		while (checkingAccount.getBalance() <= 0) {
			System.out.println("Enter initial amount to deposit in account " + checkingAccount.getAccountNumber());
			checkingAccount.deposit(scanner.nextDouble());
		}
		System.out.println("The balance after deposit is: $" + checkingAccount.getBalance());

		while (!isWithdrawn) {
			System.out.println("Enter amount to be withdrawn in account " + checkingAccount.getAccountNumber());
			try {
				checkingAccount.withdraw(scanner.nextDouble());
				isWithdrawn = true;
				System.out.println("The balance after withdraw is: $" + checkingAccount.getBalance());
			} catch (InsufficientFundsException e) {
				System.out.println(e.getClass().getSimpleName()
						+ " has occurred.\nSorry but your account is short by: $" + e.getAmount());
			}

		}
		scanner.close();
	}

}
