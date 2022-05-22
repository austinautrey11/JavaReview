package com.austinautrey.model;

public class Airplane extends FlyingVehicle {
	
	private short wheels;
	private short propellers;
	
	public Airplane(short wheels, short propellers) {
		this.wheels = wheels;
		this.propellers = propellers;
	}
	
	public short getWheels() {
		return this.wheels;
	}
	public void setWheels(short wheels) {
		this.wheels = wheels;
	}

	public short getPropellers() {
		return this.propellers;
	}
	public void setPropellers(short propellers) {
		this.propellers = propellers;
	}
}
