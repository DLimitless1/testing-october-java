package com.cognixia.jump.corejava;

public class Conditionals {

	public static void main(String[] args) {
		// If statement (stand alone)
		System.out.println("\nIf example:\n");
		
		int checkInt = 50;
		
		if (checkInt % 10 ==0) {
		System.out.println("we are divisible by 10!");
		}
		
		System.out.println("We are going on with the program");
		//If - else, and else - if
		System.out.println("\nIf else and else if:\n");
		checkInt = 45;
		if (checkInt % 10 ==0) {
			System.out.println("Divisible by 10!");
		}
		else if (checkInt % 5 == 0)
			System.out.println("divisible by 5!");
		
		else {
			System.out.println("no match.");
		}
		// Logical Condition Operators (some combinations)
		System.out.println("\nIf conditional operators:\n");
		checkInt =  -45;
		if (((checkInt > 0) && (checkInt % 5 ==0)) || checkInt %2 ==0);
			System.out.println("Success");
		
			//Nested Conditionals
			checkInt = 50;
			System.out.println("\n Nested Conditionals:\n");
			if (checkInt % 5 == 0) {
				if (checkInt % 2 == 0) {
					System.out.println("Your num is divis. by 10");
				} else {
					System.out.println("Divis. by 5, but not by 10");
		}
			String input = "yes";
			
			if (input == "yes") {
				System.out.println("User input yes");
				}
			}
			//Switch Statement (ATM Example)
		System.out.println("\nIf switch ATM example:\n");
		
		System.out.println("Welcome to the JUMP ATM. Please choose from"
				+ "the options below");
		System.out.println("Press 1 for Balance\n"
				+ "Press 2 for deposit\n"
				+ "Press 3 for withdraw\n"
				+ "Press 4 to Exit");
		
		//Hard code different user inputs
		checkInt = 3;
				//The Switch case is the logic only
		switch (checkInt) {
		case 1:
			System.out.println("You want to check balance");
		case 2:
			System.out.println("You want to deposit");			
		case 3:
			System.out.println("You want to withdraw");				
		case 4: 
			System.out.println("You want to exit");		
		default:
			System.out.println("Exiting");
		}
		
		char charIn = ' ';
		charIn = 'A';
		switch (charIn) {
		case 'a':
		case 'A':
			System.out.println("You printed the char a");
			break;
		case 'b':
		case 'B':
			System.out.println("You chose the char b or B");
		default:
			break;
		}
		
		//Ternary Operator
		int n1 = 5, n2 = 10, max;
		//max will get set to something, based on a condition (n1 or n2)
		// (this is the condition) ? -> this separates the condition from outputs
		//the right of the ?, is what happens if true : false
		// ? true " false;
		max = (n1 > n2) ? n1 :n2;
		if (n1 > n2) {
			max = n1;
		}
		else {
			max = n2;
			
		}	
		
		System.out.println(max);
	}

}
