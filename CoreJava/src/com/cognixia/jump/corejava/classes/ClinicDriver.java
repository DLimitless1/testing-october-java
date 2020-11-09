package com.cognixia.jump.corejava.classes;

public class ClinicDriver {

	public static void main(String[] args) {
		
		// Create some patient objects
		// We need the 'new' keyword to set aside space in  mem.
		// then we call one of our constructors to build our object
		Patients patient1 = new Patients();
		Patients patient2 = new Patients("Mike", 97, false);
		int count = 4;
		int count1 = 5;
		
		System.out.println(patient1.name);
		System.out.println(patient2.name);
		
		// Use some of our methods
		System.out.println(patient2.sick + " " + patient2.temperature);
		patient2.getSick();
		System.out.println(patient2.sick + " " + patient2.temperature);
		patient2.getHealthy();
		System.out.println(patient2.sick + " " + patient2.temperature);
	
		for(int i = 1;i <= 2; i++) {
			
		}
	}

}
