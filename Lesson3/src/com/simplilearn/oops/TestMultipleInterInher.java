package com.simplilearn.oops;

public class TestMultipleInterInher implements Interface1, Interface2 {

	public static void main(String[] args) {
		TestMultipleInterInher inher = new TestMultipleInterInher();
		inher.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Interface1.super.show();
		Interface2.super.show();
	}

}
