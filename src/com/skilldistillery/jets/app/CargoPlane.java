package com.skilldistillery.jets.app;

public class CargoPlane extends Jet implements CargoCarrier {

//CargoPlane(String,double, int, long)
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

//+loadCargo()void
	public void loadCargo() {
		System.out.println("Now loading cargo");

	}

}