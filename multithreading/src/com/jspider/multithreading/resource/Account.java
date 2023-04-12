package com.jspider.multithreading.resource;

public class Account {
	int accountBalance;
	public Account(int accountBalance) {
		this.accountBalance=accountBalance;
	}
	public void checkBalance() {
		System.out.println("curretn balance :"+ accountBalance);
		
	}
	public void depositAmmount(int amount) {
		System.out.println("depositing "+amount+" rs in your account ");
		accountBalance+=amount;
		checkBalance();
	}
	public void withdrawAmount(int amount ) {
		System.out.println("trying to withdraw  "+amount+" rs from account.");
		if (amount > accountBalance  ) {
			System.out.println("insufficent balance");
		}
		else {
			accountBalance-=amount;
			checkBalance();
		}
	}

}
