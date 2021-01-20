package com.simplilearn.oops;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Amirtha", "Techincal lead");
		System.out.println(employee1);
		employee1.setSalary(345345.56f);
		System.out.println(employee1.getSalary());
		Employee employee2 = new Employee(2, "John", "Developer");
		System.out.println(employee2);
		employee2.setLastName("Paul");
		System.out.println(employee2.getLastName());
		Employee employee3 = new Employee();
		System.out.println(employee3);
	}

}
