package com.skilldistillery.jets.app;

import java.io.*;
import java.util.*;

public class JetsApplication {

	public static void main(String[] args) {
		// F i e l d s
		Scanner kb = new Scanner(System.in);
		String jetFile = "jets.txt";
		
//		String input = kb.next();
		// C o n s t r u c t o r s
//	JetReader jr = new JetReader();
		JetsApplication jr = new JetsApplication();
		jr.readJets(jetFile);
//	-airfield: airfield
		AirField airField = new AirField();
//	+jetsApplication()
		JetsApplication jets = new JetsApplication();
		List<Jet> jetlist = airField.getJets();
		System.out.println(jets);
		System.out.println(jets.toString());
		System.out.println(airField);
		jets.launch();
	}

	// M e t h o d s
	private void readJets(String jetFile) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(jetFile))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetRecord = line.split(", ");
				String model = jetRecord[0];
				double speed = Double.parseDouble(jetRecord[1]);
				int range = Integer.parseInt(jetRecord[2]);
				long price = Long.parseLong(jetRecord[3]);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

//	-launch():void
	private void launch() {
		displayUserMenu();

	}

//	-displayUserMenu():void
	private void displayUserMenu() {
		Scanner kb = new Scanner(System.in);
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("(1) List fleet");
			System.out.println("(2) Fly all jets");
			System.out.println("(3) View fastest jet");
			System.out.println("(4) View jet with longest range");
			System.out.println("(5) Load all Cargo Jets");
			System.out.println("(6) Dogfight!");
			System.out.println("(7) Add a jet to Fleet");
			System.out.println("(8) Remove a jet from Fleet");
			System.out.println("(9) Quit");
			int input = kb.nextInt();
			switch (input) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
//			CargoPlane.loadCargo();
				System.out.println("5");
				break;
			case 6:
//			FighterJet.fight();
				System.out.println("6");
				break;
			case 7:
				addJet();
				break;
			case 8:
				removeJet();
				break;
			case 9:
				System.out.println("Goodbye");
				keepGoing = false;
				break;
			default:
				System.out.println("Please make correct selection");
				break;
			}
		}
	}

	private void addJet() {
		System.out.println("Which jet do you want to add");
		System.out.println("(1) Cargo Plane");
		System.out.println("(2) Fighter Jet");
		System.out.println("(3) Commercial Jet");
		Scanner kb = new Scanner(System.in);
		int input = kb.nextInt();

		switch (input) {
		case 1:
			Jet cargoAircraft = new CargoPlane("H13", 500_000_000, 50_000, 60_000_000);
			System.out.println("Cargo Plane has entered the airfield");
			System.out.println(cargoAircraft.toString());
			break;
		case 2:
			Jet fighterAircraft = new FighterJet("F11", 100_000_000, 10_000, 20_000_000);
			System.out.println("Fighter Jet has entered the airfield");
			break;
		case 3:
			Jet commercialAircraft = new CommercialJet("J15", 900_000_000, 90_000, 100_000_000);
			System.out.println("Commercial Jet has entered the airfield");
			break;
		case 4:
			displayUserMenu();
			break;
		}
	}

	private void removeJet() {

	}
}
