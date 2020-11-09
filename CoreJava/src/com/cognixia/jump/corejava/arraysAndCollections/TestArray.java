package com.cognixia.jump.corejava.arraysAndCollections;

public class TestArray {

	public static void main(String[] args) {
		int[][] array2D = new int[4][4];
		int[][] array2D2 = { { 2, 4, 6, 8 }, { 4, 2, 6 }, { 8, 2, 6, 4 } };
		System.out.println("\nTest Array ");
		
		int count = 0;
		boolean condition = true;
		while (true) {

			if (count % 2 != 0) {
				System.out.println(count);
			}
			count++;
			if (count % 25 == 0) {
				break;
			}

		}

	}

}