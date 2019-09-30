package com.skilldistillery.jets.app;

import java.io.*;
import java.util.*;

public class AirField {
	// F i e l d s
	List<Jet> jets = new ArrayList<>();
	String jetFile = "jets.txt";
	boolean keepGoing = true;

	// C o n s t r u c t o r s
	public List<Jet> readsJets() {
		readJets();
		System.out.println(jets.toString());

		return jets;
	}

	private void readJets() {
		try {
			FileReader fr = new FileReader(jetFile);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] jetRecord = line.split(", ");
				String model = jetRecord[0];
				double speed = Double.parseDouble(jetRecord[1]);
				int range = Integer.parseInt(jetRecord[2]);
				long price = Long.parseLong(jetRecord[3]);
				System.out.println(line);
				if (line.contains("Fighter")) {
					Jet a = new FighterJet(model, speed, range, price);
					jets.add(a);
				}
				if (line.contains("Cargo")) {
					Jet b = new CargoPlane(model, speed, range, price);
					jets.add(b);
				}
				if (line.contains("Commercial")) {
					Jet c = new CommercialJet(model, speed, range, price);
					jets.add(c);
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Invalid filename: " + e.getMessage());
			return;
		} catch (IOException e) {
			System.err.println("Problem while reading " + jetFile + ": " + e.getMessage());
			return;
		}
		System.out.println(jetFile);
	}

	void carrierJets() {
		System.out.println(jets.toString());
	}

	void addJets(Scanner kb) {
		while (keepGoing) {
			System.out.println("Which jet do you want to add");
			System.out.println("(1) Cargo Plane");
			System.out.println("(2) Fighter Jet");
			System.out.println("(3) Commercial Jet");
			System.out.println("(4) Main Menu");
			int input = kb.nextInt();

			switch (input) {
			case 1:

				Jet cargoAircraft = new CargoPlane("CargoJetH13", 600, 1_200, 60_000_000);
				System.out.println("Cargo Plane has entered the airfield");
				jets.add(cargoAircraft);
				System.out.println("added " + cargoAircraft.toString());
				System.out.println("Your fleet size is now " + jets.size());
				break;
			case 2:
				Jet fighterAircraft = new FighterJet("FighterJetF11", 3800, 3_000, 20_000_000);
				jets.add(fighterAircraft);
				System.out.println("added " + fighterAircraft.toString());
				System.out.println("Your fleet size is now " + jets.size());
				break;
			case 3:
				Jet commercialAircraft = new CommercialJet("CommercialJetJ15", 800, 2_000, 100_000_000);
				System.out.println("Commercial Jet has entered the airfield");
				jets.add(commercialAircraft);
				System.out.println("added " + commercialAircraft.toString());
				System.out.println("Your fleet size is now " + jets.size());
				break;
			case 4:
			default:
				keepGoing = false;
				System.out.println("Returning to main menu");
				break;
			}

		}

	}
	public void fly() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}
	public void dogFight() {
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).dogFight();
			}

		}
	}

	public void loadCargo() {
		for (Jet jet : jets) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
			}
		}
	}

	public void removeJet(Scanner kb) {
		while (keepGoing) {
			System.out.println("Current list of jets");
			System.out.println(jets.toString());
			System.out.println("Please select which type of jet to remove");
			System.out.println("(1) CargoPlane (2) FighterJet (3) CommercialJet");
			String input = kb.next();
			switch (input) {
			case "1":
				jets.remove(1);
				break;
			default:
				keepGoing = false;
			}
		}
		System.out.println("removing");

	}
}
