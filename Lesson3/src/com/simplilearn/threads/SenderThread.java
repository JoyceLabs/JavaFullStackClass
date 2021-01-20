package com.simplilearn.threads;

public class SenderThread extends Thread {
	private String message;
	private Sender sender;
	
	//Constructor
	public SenderThread(String message, Sender sender) {
		this.message = message;
		this.sender = sender;
	}
	
	@Override
	public void run() {
		/*
		 * synchronized (sender) { sender.send(message); }
		 */
		sender.send(message);
	}
	
}
