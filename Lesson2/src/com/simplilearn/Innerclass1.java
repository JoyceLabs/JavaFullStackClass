package com.simplilearn;

public class Innerclass1 {
	
	private String message = "Welcome to Java";
	
	class Inner {
		String hello = "Hello wonderful learners";
		
		void greet() {
			System.out.println(hello + ", " + message);
		}
	}
	
	public static void main(String[] args) {
		Innerclass1 outer = new Innerclass1();
		Innerclass1.Inner inner = outer.new Inner();
		inner.greet();
	}

}
