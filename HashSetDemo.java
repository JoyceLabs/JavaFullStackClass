package com.simplilearn.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		cities.add("Chennai");
		cities.add("New Delhi");
		cities.add("Mumbai");
		cities.add("Ahmedabad");
		cities.add("Kolkatta");
		cities.add("Chennai");
		cities.add(null);
		cities.add(null);
		System.out.println(cities);
	}

}
