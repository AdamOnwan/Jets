package com.skilldistillery.jets.app;

import java.util.*;

public class JetsApplication {
	private AirField airField = new AirField();
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// F i e l d s

		// C o n s t r u c t o r s
		
		JetsApplication ja = new JetsApplication();		

		ja.launch();
	}
	public void gotoAirField() {
		airField.readsJets();
		airField.addJets(kb);
		
	}

	// M e t h o d s
	public void launch() {
		displayUserMenu(kb);
	}

	public void displayUserMenu(Scanner kb) {
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
				System.out.println("List fleet");
				airField.readsJets();
				Collection<AirField> jetlist = new ArrayList<>();
				int numElements = jetlist.size();
				System.out.println(numElements);
				break;
			case 2:
				System.out.println("Fly all jets");
//				Jet.this.fly();
				break;
			case 3:
				System.out.println("View fastest jet");
				break;
			case 4:
				System.out.println("View jet with longest range");
				break;
			case 5:
//				CargoPlane.this.loadCargo();
				System.out.println("Load all Cargo Jets");
				break;
			case 6:
//				FighterJet.this.dogFight();
				break;
			case 7:
				airField.addJets(kb);
				break;
			case 8:
//				airField.remove();
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
}
