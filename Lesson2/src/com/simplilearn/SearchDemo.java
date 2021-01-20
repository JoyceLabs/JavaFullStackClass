package com.simplilearn;

import java.util.Scanner;

public class SearchDemo {

	public static void main(String[] args) {
		String countries[] = { "India", "United States", "Australia", "England" };
		System.out.println(countries.length);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a country : ");
			String input = scanner.next();
			if (input.equals("E")) {
				System.exit(0);
				scanner.close();
			}
			searchCountry(countries, input);
		}
	}

	private static void searchCountry(String[] countries, String input) {
		boolean isFound = false;
		for (String country : countries) {
			if (country.equals(input)) {
				isFound = true;
				break;
			}
		}
		if (isFound) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found!");
		}
	}

}
