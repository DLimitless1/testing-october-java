package com.cognixia.jump.corejava.arraysAndCollections;

import com.cognixia.jump.corejava.classes.Patients;

public class HealthWorker {

	// Attributes
	String name = " ";
	boolean treatSick;
	boolean isSick;
	public String runTests = "LDL, HDL, A1C, Hem, VitD" ;
		
	//Constructor
		public HealthWorker() {
			this.name = "";
		}

	// Methods
	public void runTests() {
		this.runTests = name;
	}

	public void treatSick(Patients patient) {
		this.isSick = false;
	}
}
