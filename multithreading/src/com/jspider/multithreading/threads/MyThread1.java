package com.jspider.multithreading.threads;


public class MyThread1 extends Thread{

	@Override
	public void run() {
		 for(int i=1;i<=5;i++) {
		System.out.println("MyThread  1 is running ..!!");
		 }
		
	}

}
