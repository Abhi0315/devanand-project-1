package com.jspider.multithreading.threads;
import com.jspider.multithreading.resource.Account;
public class Person1 extends Thread{
	Account account;
	public Person1 (Account account) {
	this.account=account;
	}
	@Override
	public void run() {
		account.depositAmmount(5000);
		account.withdrawAmount(3000);
	}
}
