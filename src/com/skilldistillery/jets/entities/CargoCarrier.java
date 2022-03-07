package com.skilldistillery.jets.entities;

public class CargoCarrier extends Jet implements CargoJet {

	public CargoCarrier(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}

	@Override
	public void loadCargo() {
		System.out.println("Loading up the cargo!");

	}

	@Override
	public void fly() {
		double flightTime = this.getRange() / this.getSpeed();
		System.out.println("The " + this.getModel() + " has a max speed of " + this.getSpeed() + " mph. Range: "
				+ this.getRange() + " miles.");
		System.out.println("Flight time at max speed:   " + flightTime + " hours.");

	}

}