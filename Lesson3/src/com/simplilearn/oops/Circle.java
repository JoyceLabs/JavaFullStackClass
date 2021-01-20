package com.simplilearn.oops;

public class Circle extends Shape {
	double radius;
	
	@Override
	void calculateArea() {
		System.out.println("Area of circle : " + (Math.PI * radius * radius));

	}

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

}
