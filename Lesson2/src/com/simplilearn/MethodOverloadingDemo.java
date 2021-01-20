package com.simplilearn;

public class MethodOverloadingDemo {
	// Calculate the area of rectangle
	private void area(int length, int width) {
		System.out.println("Area of rectangle :" + (length * width));
	}

	// Calculate the area of circle
	public double area(int radius) {
		return Math.PI * radius * radius;
	}

	// Calculate the area of square
	void area(double side) {
		System.out.println("Area of square : " + (side * side));
	}

	public static void main(String[] args) {
		int a = 30;
		// Instantiate an object
		MethodOverloadingDemo methodOverloadingDemo = new MethodOverloadingDemo();
		methodOverloadingDemo.area(a, 40);
		double areaOfCircle = methodOverloadingDemo.area(a);
		System.out.println("Area of circle : " + areaOfCircle);
		methodOverloadingDemo.area(10.5);
	}

}
