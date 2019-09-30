package com.skilldistillery.jets.app;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void dogFight() {
		System.out.println(getModel() + " dogfighting now");
	}
}