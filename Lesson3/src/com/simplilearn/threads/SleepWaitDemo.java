package com.simplilearn.threads;

public class SleepWaitDemo {
	
	private static Object LOCK = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Thread '" + Thread.currentThread().getName() + "'is woken after 2 sec");
		synchronized (LOCK) {
			LOCK.wait(5000);
			System.out.println("Thread '" + Thread.currentThread().getName() + "'is woken after 5 sec");
			
		}
	}

}
