package com.jspider.multithreading.threads;
import com.jspider.multithreading.resource.Account;
public class Person2 extends Thread {
	Account account;
	
	public Person2(Account account) {
		this.account=account;
	}
	@Override
	public void run() {
		account.depositAmmount(3000);
		account.withdrawAmount(1500);
	}

}
