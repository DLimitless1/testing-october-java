package com.cognixia.jump.corejava.arraysAndCollections;

import java.util.Arrays;

public class FriClassAsssignment {

	public static void main(String[] args) {
		// Between these curly braces is what I call the thing I want done get executed

		int[] groupNumbers = new int[100];
		int missingNum = 35;
		int value = 1;
		// x++ is the same as x = x + 1
		for(int x = 0;x < groupNumbers.length; x++) {
			if (x == missingNum - 1) {
				value++;
			}
			groupNumbers[x] = value;
			value++;
		}
		
		System.out.println(Arrays.toString(groupNumbers));
	missingNum(1,100);
	}
	// This is where my references on my instructions exist, as needed, unless I call upon it
	
	public static String missingNum(int start, int finish) {
		int missingNum = 9;
		
//		for (int x = 0;x < input.length; x++) {
//		//put some if statements here to check for missing numbers	
//		}
		return "";
	}
		}
//	// 2nd Pseudo Code Challenge
//		int x = int(10);
//		int y = int(5);
//				System.out.println("x= " + x + "y= " + y);
//
//				x = x - y;
//				y = x + x;
//
//				return new value(x);
//				return new value(y);
//				System.out.println("x= " + x + "y= " + y);
//}

