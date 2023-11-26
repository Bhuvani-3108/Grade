package com.atm;

public class AtmMachine {a
	public void withdraw(UserAccount userAccount, int withdrawAmount) {
		int currentBalance;
		if (userAccount.getBalance()<withdrawAmount) {
			System.out.println("withdrawl is not possible because your account balance is low");
		} else {
			currentBalance = userAccount.getBalance();
			userAccount.setBalance(currentBalance-withdrawAmount);
			System.out.println("successfully withdrawl");
		}
	}
	
	public void deposit(UserAccount userAccount, int depositAmount) {
		int currentBalance;
		currentBalance = userAccount.getBalance();
		userAccount.setBalance(currentBalance+depositAmount);
	}
	
	public int checkBalance(UserAccount userAccount) {
		return userAccount.getBalance();
	}

	
	public void displayUI() {
		this.printStars();
		System.out.println("ATM MACHINE");
		this.printStars();
		System.out.println("1.\tCreate Account for your convenience \n2.\tCheck Balance\n3.\tWithdraw Amount\n4.\tDeposit Amount\n5.\tExit");
		this.printStars();
		System.out.println("\nEnter  Option:");
	}
	public void printStars() {
		System.out.println("**********");
	}
}
