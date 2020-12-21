package com.simplilearn.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.capacity());
		buffer.append("Heello");
		System.out.println(buffer.capacity());
		buffer.replace(1, 3, "a");
		System.out.println(buffer);
		buffer.delete(1, 3);
		System.out.println(buffer);
		//insert
		buffer.insert(1, "HH");
		System.out.println(buffer);
		buffer.reverse();
		System.out.println(buffer);
		//(old capacity * 2) + 2
		
		String s1 = "Welcome";
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb);
	}

}
