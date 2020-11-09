package com.cognixia.jump.corejava.arraysAndCollections;

public class testStringsDriver {
	public static void main(String[] args) {
		// 1st Answer
		System.out.println(reverseString("World"));
		//2nd Answer
		System.out.println(reverseStringAlt("Test"));
	}
// #1st approach
	public static String reverseString(String input) {
		char[] charArray = input.toCharArray();
		char[] reversed = new char[input.length()];
		int revIndex = 0;
		
		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed[revIndex] = charArray[i];
			revIndex++;
		}
		return new String(reversed);
	}
	// #2nd approach
	public static String reverseStringAlt(String input) {
		StringBuilder builder = new StringBuilder(input);
		builder.reverse();
		return builder.toString();
	}
}