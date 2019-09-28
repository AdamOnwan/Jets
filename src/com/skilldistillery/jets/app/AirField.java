package com.skilldistillery.jets.app;

import java.util.*;

public class AirField {
	// F i e l d s
	// C o n s t r u c t o r s
//-jets: jet[]
	public List<Jet> getJets(){
		List<Jet> jets = new ArrayList<>();
		
		jets.add(new FighterJet("F11", 100_000_000, 10_000, 20_000_000));
		jets.add(new FighterJet("G12", 300_000_000, 30_000, 40_000_000));
		jets.add(new CargoPlane("H13", 500_000_000, 50_000, 60_000_000));
		jets.add(new CargoPlane("I14", 700_000_000, 70_000, 80_000_000));
		jets.add(new CommercialJet("J15", 900_000_000, 90_000, 100_000_000));
		System.out.println(jets.toString());
		
		return jets;
		
	//M e t h o d s
	}
}
//+airfield()
