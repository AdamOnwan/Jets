package com.skilldistillery.jets.app;

import java.io.*;
import java.util.*;

public class AirField {
	// F i e l d s
	List<Jet> jets = new ArrayList<>();
	String jetFile = "jets.txt";

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
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("Which jet do you want to add");
			System.out.println("(1) Cargo Plane");
			System.out.println("(2) Fighter Jet");
			System.out.println("(3) Commercial Jet");
			System.out.println("(4) Main Menu");
			int input = kb.nextInt();

			switch (input) {
			case 1:

				Jet cargoAircraft = new CargoPlane("H13", 500_000_000, 50_000, 60_000_000);

				System.out.println("Cargo Plane has entered the airfield");
				jets.add(cargoAircraft);
				System.out.println("there is now this many Fighter jets ");
				System.out.println(jets.size());
				System.out.println(jets.toString());
				System.out.println(cargoAircraft.toString());
				break;
			case 2:
				Jet fighterAircraft = new FighterJet("F11", 100_000_000, 10_000, 20_000_000);
				System.out.println("Fighter Jet has entered the airfield");
				jets.add(fighterAircraft);
				System.out.println("there is now this many Fighter jets ");
				System.out.println(jets.size());
				System.out.println(jets.toString());
				break;
			case 3:
				Jet commercialAircraft = new CommercialJet("J15", 900_000_000, 90_000, 100_000_000);
				System.out.println("Commercial Jet has entered the airfield");
				jets.add(commercialAircraft);
				System.out.println("there is now this many Commercial jets ");
				System.out.println(jets.size());
				System.out.println(jets.toString());
				break;
			case 4:
				keepGoing = false;
				System.out.println("Returning to main menu");
				break;
			}

		}

	}
	public void dogFight() {
		for (Jet jet : jets) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).dogFight();
			}
			
		}
	}

	public void removeJet(Scanner kb) {
		System.out.println("removing");
		
	}
}
