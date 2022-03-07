package com.skilldistillery.jets.entities;

public class Jetimpl extends Jet {

	public Jetimpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		double flightTime = this.getRange() / this.getSpeed();
		System.out.println("The " + this.getModel() + " has a max speed of " + this.getSpeed() + " mph. Range: "
				+ this.getRange() + " miles.");
		System.out.println("Flight time at max speed: " + flightTime + " hours.");
	}

}