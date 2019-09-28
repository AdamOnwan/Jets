package com.skilldistillery.jets.app;

public class FighterJet extends Jet implements CombatReady {

//FighterJet(String, double, int, long)
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
//+fight():void
	public void fight() {
		System.out.println("Now engaging the enemy");
	}
}