package com.simplilearn.innerclasses;

public class Innerclass3 {

	public static void main(String[] args) {
		AnonymousInnerClass anonymousObject = new AnonymousInnerClass() {
			
			@Override
			public void display() {
				System.out.println("I am inside display method of AnonymousInnerClass");
				
			}
		};
		anonymousObject.display();

	}

}


abstract class AnonymousInnerClass {
	public abstract void display(); 
}
