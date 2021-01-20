package com.simplilearn.oops;

public class MountainBike extends Bicycle{
	private int seatHeight;

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	@Override
	public void applyBrake(int decrement) {
		System.out.println("Inside apply brake of Mountain bike");
		this.speed = this.speed - decrement - 10;
	}

}
