package com.cognixia.jump.corejava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDriver {

	// java -ea ExceptionsDriver
	// ea = assertions enabled
	
	// Attributes
	static int input = 0; 
	static int answer = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		try {
			input = scan.nextInt();
			answer = 10 / input;
			System.out.println(input);
			
	//Go Specific to general catches
		} catch(InputMismatchException e) {
			// this is not acceptable if this line is blank. Do something with it.
			System.out.println("You didn't enter an integer");
//			e.printStackTrace();
//			input = 0;
		}catch(ArithmeticException e) {
			System.out.println("Illegal operation, you " + e.getMessage());
			// same thing as e.printStackTrace();
			//e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Oops something went wrong");
		}
		finally {
			System.out.println("Finally block prints regardless");
			scan.close();
		}
	}
	// Chain methods together
	public static void inputNumberTest(Scanner scan) throws InputMismatchException, ArithmeticException{
	
	System.out.println("Type a number");
	input = scan.nextInt();
	
	assert input > 0 : "Negative Number";
	answer = 10 / input;
	System.out.println(answer);
	
	}
}
