package com.jspider.multithreading.main;

import com.jspider.multithreading.threads.MyThread1;
import com.jspider.multithreading.threads.MyThread2;
import com.jspider.multithreading.threads.MyThread3;


public class ThreadMain{

	public static void main(String[] args) {
//		MyThread1 myThread1=new MyThread1();
//		MyThread2 myThread2=new MyThread2();
//		Thread thread=new Thread(myThread2);
//		myThread1.start();
//		thread.start();
		MyThread3 myThread3 =new MyThread3();
		myThread3.start();
	}
}
