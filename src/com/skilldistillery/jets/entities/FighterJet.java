package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fight() {

		System.out.println("Target locked");
		System.out.println("BRRRRRTTT");
		System.out.println("Target eliminated");

	}

	@Override
	public void fly() {
		double flightTime = this.getRange() / this.getSpeed();
		System.out.println("The " + this.getModel() + " has a max speed of " + this.getSpeed() + " mph. Range: "
				+ this.getRange() + " miles.");
		System.out.println("Flight time at max speed: " + flightTime + " hours.");
	}

}
