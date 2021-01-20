package com.simplilearn.threads;

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {
		//Step 1 - instantiate a sender object
		Sender sender = new Sender();
		SenderThread thread1 = new SenderThread("Hi", sender);
		SenderThread thread2 = new SenderThread("Bye", sender);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
	}

}
