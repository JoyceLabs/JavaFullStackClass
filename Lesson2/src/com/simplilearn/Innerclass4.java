package com.simplilearn;

public class Innerclass4 {

	static class Inner {
		public void display() {
			System.out.println("I am inside static method of Inner");
		}
	}
	public static void main(String[] args) {
		Innerclass4.Inner inner = new Innerclass4.Inner();
		inner.display();
	}

}