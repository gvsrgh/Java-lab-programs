package lab04;

import java.util.Scanner;

public class Account {
	private double balance;
	private int id;
	public static Scanner in = new Scanner(System.in);

	public Account() {
		balance = 0.0;
		id = 0;
	}

	public Account(int id, double balance) {
		this.setId(id);
		this.setBalance(balance);
	}

	public boolean setId(int id) {
		if(id < 0) {
			System.out.println("Invalid ID!!");
			return false;
		}
		this.id = id;
		return true;
	}

	public int getId() {
		return id;
	}

	public boolean setBalance(double balance) {
		if(balance < 0) {
			System.out.println("Initial Balance should be greater than 0!!");
			return false;
		}
		this.balance = balance;
		return true;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposit successful! Your new balance is: " + balance);
		} else {
			System.out.println("Deposit amount must be positive!");
		}
	}

	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful! Your new balance is: " + balance);
		} else {
			System.out.println("Invalid withdrawal amount!");
		}
	}

	public void printDetails() {
		System.out.println("Account ID: " + id);
		System.out.println("Account Balance: " + balance);
	}

	public static void main(String args[]) {
		int choice = 0;
		double amount;
		Account a = new Account();
		int id;
		System.out.println("Enter your Bank ID: ");
		id = in.nextInt();
		a.setId(id);
		System.out.println("Enter Initial Balance: ");
		amount = in.nextDouble();
		a.setBalance(amount);
		while(choice != 4) {
			System.out.println("-------Menu-------");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Details");
			System.out.println("4. Terminate");
			System.out.println("------------------");
			System.out.println("Enter your choice: ");
			choice = in.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter the amount: ");
					amount = in.nextDouble();
					a.deposit(amount);
					break;
				case 2:
					System.out.println("Enter the amount: ");
					amount = in.nextDouble();
					a.withdraw(amount);
					break;
				case 3:
					a.printDetails();
					break;
				case 4:
					System.out.println("Terminating...");
					break;
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}
