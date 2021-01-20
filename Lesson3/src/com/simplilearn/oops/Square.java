package com.simplilearn.oops;

public class Square extends Shape {
	double side;
	
	@Override
	void calculateArea() {
		System.out.println("Area of square : " + (side * side));

	}

	public Square(String color, double side) {
		super(color);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", color=" + color + "]";
	}

	

}
