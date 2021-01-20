package com.simplilearn.oops;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		while (true) {
			Shape shape = null;
			choice = showMenu(scanner);
			switch (choice) {
			case 1:
				shape = new Square("Red", 20);
				System.out.println(shape);
				shape.calculateArea();
				break;
			case 2:
				shape = new Rectangle("Blue", 25.55, 20);
				System.out.println(shape);
				shape.calculateArea();
				break;
			case 3:
				shape = new Circle("Yellow", 40);
				System.out.println(shape);
				shape.calculateArea();
				break;
			default:
				scanner.close();
				System.out.println(" Program ends.....");
				System.exit(0);
			}
		}
	}

	private static int showMenu(Scanner scanner) {
		System.out.println("Please enter an option ");
		System.out.println("1. Square");
		System.out.println("2. Rectangle");
		System.out.println("3. Circle");
		System.out.println("Press any number to exit");
		int choice = scanner.nextInt();
		return choice;
	}

}
