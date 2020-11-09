package com.cognixia.jump.corejava.arraysAndCollections;

import com.cognixia.jump.corejava.classes.Patients;

public class ClinicDriver {

	public static void main(String[] args) {
		Patients[] waitingRmPt = new Patients[12];
		
		for(int x = 0;x < waitingRmPt.length; x++) {
			waitingRmPt[x] = new Patients();
		}	
		waitingRmPt[7].setSick(true);
		waitingRmPt[11].setSick(true);
		// Need another for loop to go through waiting rm pt and a healthcare worker obj that will do a run test, through ea. pt, inside the loop
		HealthWorker hw = new HealthWorker();
		for(int x = 0;x < waitingRmPt.length; x++) {
			hw
		}	
	
	}
}