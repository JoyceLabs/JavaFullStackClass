package com.simplilearn.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		try {
			int number1 = scanner.nextInt();
			System.out.println("Enter the second number : ");
			int number2 = scanner.nextInt();
			System.out.println("Output : " + number1 / number2);
			System.exit(0);
		} catch (InputMismatchException exception) {
			System.out.println("Please enter only numbers");
			exception.printStackTrace();
		} catch (ArithmeticException arithmeticException) {
			System.out.println("You cannot divide a number by zero");
			arithmeticException.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			System.out.println("inside finally block");
			scanner.close();
		}
		System.out.println("Program terminates....");
	}

}
