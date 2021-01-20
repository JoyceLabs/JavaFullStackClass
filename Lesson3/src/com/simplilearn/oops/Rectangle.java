package com.simplilearn.oops;

public class Rectangle extends Shape {
	double length, breadth;
	
	@Override
	void calculateArea() {
		System.out.println("Area of rectangle : " +(length * breadth));

	}

	public Rectangle(String color, double length, double breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", color=" + color + "]";
	}

}
