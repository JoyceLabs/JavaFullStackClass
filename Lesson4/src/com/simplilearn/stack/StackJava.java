package com.simplilearn.stack;

public class StackJava {
	static final int MAX = 5;
	int top;
	int arr[];
	
	Stack() {
		top = -1;
		arr = new int[MAX];
	}
	
	/**
	 * Adds an element onto the top of the stack
	 * @param x element that needs to be inserted
	 * @return true if push is successful, false if stack overflow
	 */
	boolean push(int x) {
		if(top >= MAX -1) {
			System.out.println("Stack overflow");
			return false;
		} else {
			top++;
			arr[top] = x;
			System.out.println(x + " pushed onto the top of the stack");
			return true;
		}
	}
	
	/**
	 * This method removes the element from the top of the stack
	 * @return 0, if there is no element in the stack or element from the top of the stack that gets removed 
	 */
	int pop() {
		if(top < 0) {
			System.out.println("Stack underflow");
			return 0;
		} else {
			int a = arr[top];
			top--;
			System.out.println(a + " popped from the stack");
			return a;
		}
	}
	
	boolean isEmpty() {
		return top < 0;
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println("Is Stack Empty ? " + stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);	
		System.out.println("Is Stack Empty ? " + stack.isEmpty());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("Is Stack Empty ? " + stack.isEmpty());
	}

}
