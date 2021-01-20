package com.simplilearn;


public class Innerclass2 {
	
	private String message = "Welcome to Java";
	
	public void display() {
		 class Inner {
			String hello = "Hello wonderful learners";
			
			void greet() {
				System.out.println(hello + ", " + message);
			}
		}
		Inner inner = new Inner();
		inner.greet();
	}

	public static void main(String[] args) {
		Innerclass2 innerclass2 = new Innerclass2();
		innerclass2.display();
	}

}
