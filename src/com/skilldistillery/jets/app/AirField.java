package com.skilldistillery.jets.app;

import java.io.*;
import java.util.*;

public class AirField {
	// F i e l d s
	List<Jet> jets = new ArrayList<>();
	String jetFile = "jets.txt";
	// C o n s t r u c t o r s
	public List<Jet> readsJets(){
		readJets();
		System.out.println(jets.toString());
		
		return jets;
	}
		
	
	private void readJets() {
	try {
		  FileReader fr = new FileReader(jetFile);
		  BufferedReader br = new BufferedReader(fr);
		  String line;
		  while ( (line = br.readLine()) != null) {
			  String[] jetRecord = line.split(", ");
			  String model = jetRecord[0];
			  double speed = Double.parseDouble(jetRecord[1]);
			  int range = Integer.parseInt(jetRecord[2]);
			  long price = Long.parseLong(jetRecord[3]);
		    System.out.println("Read the line: " + line);
		  }
		  br.close();
		}
		catch (FileNotFoundException e) {
		  System.err.println("Invalid filename: " + e.getMessage());
		  return;
		}
		catch (IOException e) {
		  System.err.println("Problem while reading "+jetFile+": "+e.getMessage());
		  return;
		}
	System.out.println(jetFile);
	}
//	private void readJets(String jetFile) {
//		try (BufferedReader bufIn = new BufferedReader(new FileReader(jetFile))) {
//			String line;
//			while ((line = bufIn.readLine()) != null) {
//				String[] jetRecord = line.split(", ");
//				String model = jetRecord[0];
//				double speed = Double.parseDouble(jetRecord[1]);
//				int range = Integer.parseInt(jetRecord[2]);
//				long price = Long.parseLong(jetRecord[3]);
//			}
//		} catch (IOException e) {
//			System.err.println(e);
//		}
//	}
	
	
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
				System.out.println(cargoAircraft.toString());
				break;
			case 2:
				Jet fighterAircraft = new FighterJet("F11", 100_000_000, 10_000, 20_000_000);
				System.out.println("Fighter Jet has entered the airfield");
				break;
			case 3:
				Jet commercialAircraft = new CommercialJet("J15", 900_000_000, 90_000, 100_000_000);
				System.out.println("Commercial Jet has entered the airfield");
				jets.add(commercialAircraft);
				break;
			case 4:
				keepGoing = false;
				System.out.println("Returning to main menu");
				break;
			}
			
		}
		
	}
		public void removeJet(Scanner kb) {
			System.out.println("removing");

		}
}
