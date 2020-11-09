package com.cognixia.jump.corejava.abstractAndInterfaces;

public abstract class Athlete {

	// We cannot instantiate this class (make objects) but we can inheriet it
	
	// Attributes
	private String name;
	
	 // Methods
		// Concrete or implemented method
	public void move() {
		System.out.println("Athlete moved");
	}
	 // abstract - voila - have 
	public abstract void stop();
	
	// 
}