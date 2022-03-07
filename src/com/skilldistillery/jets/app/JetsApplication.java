package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;

public class JetsApplication {
	Scanner userIn = new Scanner(System.in);
	private Airfield airfield = new Airfield();

	public static void main(String[] args) {
		JetsApplication jetApp = new JetsApplication();
		jetApp.launch();
	}

	public void launch() {
		while (true) {
			System.out.println("-----Welcome to the Jets App------");
			System.out.println("1) List Fleet");
			System.out.println("2) Fly All Jets");
			System.out.println("3) View Fastest Jet");
			System.out.println("4) View Longest Range");
			System.out.println("5) Load Cargo Jets");
			System.out.println("6) Dogfight!");
			System.out.println("7) Add a Jet");
			System.out.println("8) Remove a Jet");
			System.out.println("9) Quit Program");
			System.out.println();
			System.out.print("Please make a selection: ");
			int selection = userIn.nextInt();
			switch (selection) {
			case 1:
				airfield.listFleet();
				break;
			case 2:
				airfield.flyJets();
				break;
			case 3:
				airfield.viewFastest();
				break;
			case 4:
				airfield.longestRange();
				break;
			case 5:
				airfield.loadCargo();
				break;
			case 6:
				airfield.dogfight();
				break;
			case 7:
				airfield.addJet();
				break;
			case 8:
				airfield.removeJet();
				break;
			case 9:
				System.out.println("Thank you for using the Jets app.");
				System.exit(0);
				break;
			}
		}

	}
}