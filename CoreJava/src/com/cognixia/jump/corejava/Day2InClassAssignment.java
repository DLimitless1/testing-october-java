package com.cognixia.jump.corejava;

public class Day2InClassAssignment {

	public static void main(String[] args) {

		String f = "Fizz", b = "Buzz", fandb = "even_neg", n = " ", fb = "f+b", answer = null;
		
		int userInput = -10;

		while (userInput <50) {
	
		if (userInput < 0 && userInput % 2 == 0) {
			System.out.println("Even Neg");
		}
		else if (userInput > 0 && userInput % 3 == 0) {
			if (userInput > 0 && userInput % 5 == 0) {
			System.out.println(userInput + "FizzBuzz");
			}
			else {
			System.out.println(userInput + "Fizz");
		}
		}
		else if (userInput > 0 && userInput % 5 == 0) {
			System.out.println(userInput + "Buzz");
		}
		else {
		
		System.out.println(userInput);
		}
		userInput++;
		}
}
}