package com.simplilearn.collection;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> integersQueue = new PriorityQueue<Integer>();
		integersQueue.add(2);
		integersQueue.add(5);
		integersQueue.add(3);
		integersQueue.add(1);
		System.out.println(integersQueue);
		// Peek - - returns the first element
		System.out.println("using peek method");
		System.out.println(integersQueue.peek());
		//Poll - returns the first element and removes it
		System.out.println("Using Poll method");
		System.out.println(integersQueue.poll());
		System.out.println(integersQueue.size());
	}

}
