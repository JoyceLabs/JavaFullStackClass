package com.simplilearn.exceptions;

public class VotingSystem {

	public static void main(String[] args) {
		int age = 19;
		try {
			validateAge(age);
		} catch(InvalidAgeException ageException) {
			ageException.printStackTrace();
		}
		System.out.println("Program terminates...");

	}

	private static void validateAge(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("You are not eligible to vote!");
		} else {
			System.out.println("You are eligible to vote :) ");
		}
	}

}
