package com.simplilearn.threads;

public class Sender {
	public synchronized void send(String message) {
		System.out.println("Sending\t" + message);
		try {
			Thread.sleep(2000);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		System.out.println("\n" + message + "\tSent");
	}

}
