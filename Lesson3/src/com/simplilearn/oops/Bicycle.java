package com.simplilearn.oops;

public class Bicycle {
	int gear, speed;
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}

}

