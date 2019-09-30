package com.skilldistillery.jets.app;

import java.text.DecimalFormat;

public abstract class Jet {
	// F i e l d s
	DecimalFormat df = new DecimalFormat("#.00");
	private String model;
	private double speed;
	private int range;
	private long price;

	// C on s t r u c t o r s
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	// M e t h o d s

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String toString() {
		return "Jet model=" + model + ", machSpeed=" + df.format(mach(speed)) + ", range=" + range + ", price="
				+ df.format(price) + "" + "\n";
	}

	public void fly() {
		System.out.println(model + " is flying around at " + speed + "MPH");
		double airTime = getRange() / getSpeed();
		System.out.println("will land before this " + df.format(airTime) + " many hours\n");
	}

	public double mach(double speed) {
		double mach = speed / 767.269;
		return mach;
	}

}
