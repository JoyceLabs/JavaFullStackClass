package com.simplilearn.threads;

public class MyRunnableThread implements Runnable{

	public static void main(String[] args) {
		MyRunnableThread myRunnableThread = new MyRunnableThread();
		Thread thread1 = new Thread(myRunnableThread);
		thread1.start();
	}

	@Override
	public void run() {
		System.out.println("Inside run method");
		
	}

}
