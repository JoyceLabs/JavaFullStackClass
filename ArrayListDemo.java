package com.simplilearn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Instantiate an ArrayList object
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Chennai");
		cities.add("New Delhi");
		cities.add("Mumbai");
		cities.add("Ahmedabad");
		cities.add("Kolkatta");
		cities.add("Chennai");
		cities.add(null);
		cities.add(null);
		System.out.println(cities);
		/*
		 * Collections.sort(cities); System.out.println("After sorting : " + cities); //
		 * remove, size(), set(index, value), get(1), indexOf("Chennai"),
		 * lastIndexOf("Chennai"), clear(), Arrays.asList() // For each loop
		 * System.out.println("Using for each"); for(String city : cities) {
		 * System.out.println(city); } System.out.println("************************");
		 * System.out.println("Using iterator"); Iterator<String> iterator =
		 * cities.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
	}

}
