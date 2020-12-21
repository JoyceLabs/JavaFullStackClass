package com.simplilearn.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, Student> studentMap = new HashMap<>();
		Student student1 = new Student(1, "John", "Chennai");
		Student student2 = new Student(2, "Priya", "Hyderabad");
		studentMap.put(1, student1);
		studentMap.put(2, student2);
		studentMap.put(null, student1);
		System.out.println(studentMap);
		Set<Entry<Integer, Student>> entries = studentMap.entrySet();
		for (Entry<Integer, Student> entry : entries) {
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
		}
	}

}
