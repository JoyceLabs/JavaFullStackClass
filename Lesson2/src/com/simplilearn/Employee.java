package com.simplilearn;

public class Employee {
	int empId;
	String name;

	void display() {
		System.out.println("Name : " + name + "Id : " + empId);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.display();
	}

}
