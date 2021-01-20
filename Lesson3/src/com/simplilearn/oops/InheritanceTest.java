package com.simplilearn.oops;

public class InheritanceTest {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(5, 50);
		System.out.println(bicycle);
		bicycle.applyBrake(10);
		System.out.println(bicycle.speed);
		bicycle.speedUp(20);
		System.out.println(bicycle.speed);
		
		MountainBike mountainBike = new MountainBike(7, 100, 25);
		System.out.println(mountainBike);
		mountainBike.applyBrake(10);
		System.out.println(mountainBike.speed);
		mountainBike.setSeatHeight(30);
		System.out.println(mountainBike.getSeatHeight());
		
		Bicycle bicycle2 = new MountainBike(11, 150, 28);
		System.out.println(bicycle2);
		bicycle2.applyBrake(30);
		System.out.println(bicycle2.speed);

	}

}
