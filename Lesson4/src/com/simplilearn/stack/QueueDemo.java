package com.simplilearn.stack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> namesQueue = new LinkedList<>();
		namesQueue.add("Amirtha");
		namesQueue.add("PARTHKUMAR");
		namesQueue.add("Gopal");
		namesQueue.add("anup");
		namesQueue.add("Shraddha");
		namesQueue.add("Priyanshu");
		namesQueue.add("Ramesh");
		namesQueue.add("Nithya");
		namesQueue.add("abhishek");
		namesQueue.add("Tanvi");
		namesQueue.add("kesananitesh");
		namesQueue.add("DK");
		namesQueue.add("Puspita");
		System.out.println("Queue :: " + namesQueue);
		System.out.println("Head of the Queue : " + namesQueue.peek());//both peek() and element() returns the head of the Q
		namesQueue.remove();// throws an exception, poll() -> returns null
		System.out.println("Head of the Queue : " + namesQueue.element());
		System.out.println("Queue after remove() :: " + namesQueue);
		System.out.println("Size : " + namesQueue.size());
		namesQueue = new LinkedList<>();
		System.out.println(namesQueue.poll());
		namesQueue.remove();
	}

}
