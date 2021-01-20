package com.simplilearn.oops;

public abstract class Shape {
	String color;
	
	abstract void calculateArea();

	public Shape(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	
	
}
