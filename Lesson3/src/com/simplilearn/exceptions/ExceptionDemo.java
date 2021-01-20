package com.simplilearn.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		int[] ints = new int[5];
		try {
			ints[7] = 10;
		} catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("An exception has occurred");
			arrayIndexOutOfBoundsException.printStackTrace();
			/*
			 * arrayIndexOutOfBoundsException.toString();
			 * arrayIndexOutOfBoundsException.getMessage();
			 */
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		
		System.out.println("Program terminates");

	}

}
