package com.simplilearn.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> cities = new TreeSet<>();
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
