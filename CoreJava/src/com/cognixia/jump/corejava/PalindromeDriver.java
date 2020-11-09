package com.cognixia.jump.corejava;

public class PalindromeDriver {

	public static void main(String[] args) {
		System.out.println(reverseString("racecar"));
		System.out.println(reverseString("noon"));
		System.out.println(reverseString("solos"));
		System.out.println(reverseString("kayak"));
		System.out.println(reverseString("level"));
		System.out.println(reverseString("radar"));
		System.out.println(reverseString("house"));
	}

	private String Palindrome = 0;
	char[] Palindrome = 0;

	public static String reverseString(String input) {
		char[] charArray = input.toCharArray();
		char[] reversed = new char[input.length()];
		int revIndex = 0;

		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed[revIndex] = charArray[i];
			revIndex++;
		}
	}
}