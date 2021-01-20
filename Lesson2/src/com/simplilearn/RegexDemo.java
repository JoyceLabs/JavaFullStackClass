package com.simplilearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		matchPattern();

	}

	private static void matchPattern() {
		String input = "Re1gular E!xpressions@gmail.com";
		String pattern = "[a-zA-Z@]+";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		while(m.find())  {
			System.out.print(input.substring(m.start(), m.end()));
		}
	}

}
