package com.cognixia.jump.corejava.arraysAndCollections;

import com.cognixia.jump.corejava.classes.Animal;
import com.cognixia.jump.corejava.classes.Dog;

public class ArraysDriver {

	public static void main(String[] args) {

		// create some arrays

		// declare - primitives and object arrays
		int[] integers;
		boolean[] booleans;
		short[] shorts;
		// array of objects
		Animal[] animals;

		// these are the same, but line 10 is better syntax
		int ints[];

		// initializing
		// no values
		integers = new int[5]; // starts with 0s in all elements
		animals = new Animal[5]; // starts with null in all elements

		// with values - must declare and initialize at the same time
		// primitives
		short[] altShorts = { 12, 25, 31, 44, 5 };
		// objects
		Animal[] altAnimal = { new Animal("Dog"), new Animal("Fish"), new Animal("elephant") };
		// accessing - reading and writing to array
		// Read from array - 1 element
		System.out.println(animals[0]);
		System.out.println(altAnimal[0]);
		System.out.println(integers[0]);
		System.out.println(altShorts[4]);

		// write to array - 1 elem
		integers[0] = 25;
		animals[0] = new Animal("Alligator", 1000, 2, false, true);
		altAnimal[0] = null;
		altShorts[4] = 0;

		// printing again to see the write changes
		System.out.println("\nAfter write changes");
		System.out.println(animals[0]);
		System.out.println(altAnimal[0]);
		System.out.println(integers[0]);
		System.out.println(altShorts[4]);

		// looping / interating through arrays (The following 2 are the BEST ways)
		// traditional for loop
		// we'll use altAnimals and altShorts
		// going forwards, 1 at a time to the end
		for (int i = 0; i < altAnimal.length; i++) {
			System.out.println(altAnimal[i]);
		}
		// regular for loop, but print from end to beginning
		// short[] altSHorts = {12, 25, 31, 44, 0};
		for (int i = altShorts.length - 1; i >= 0; i--) {
			System.out.println(altShorts[i]);
		}
		System.out.println("\nFor Each Loop:");
		// for each loop - not handling indexes -> no [i] (more susinct)
		// primitives - show read and write with for each
		for (short s : altShorts) {
			s = 0;
		}
		for (short s : altShorts) {
			System.out.println(s);
		}

		for (short s : altShorts) {
			System.out.println(s);
		}
		// objects, same as above
		// **write into an existing object
		for (Animal a : altAnimal) {
			if (a != null) {
				a.setType("Crocodile");
			}

			}
		for (Animal a : altAnimal) {
			if (a != null) {
				System.out.println(a.getWeight());
			}
			
			// homogenous array - objects only
			// see altAnimals array above

			// heterogenous array
			Animal[] mixArray = { new Dog(), new Animal("Cat"), new Dog("Maltese") };

			Animal dog = new Dog();

			for (Animal animal : mixArray) {
				System.out.println(animal);
			}

			// 2D Array - simple, iterating
			int[][] array2D = new int[4][4];

			int[][] array2D2 = { { 1, 2, 3, 4 }, { 1, 2, 3 }, { 1, 2, 3, 4 } };
			// the .length of a 2D array gets the number of rows
			System.out.println("\n2D Array Eg. ");
			for (int row = 0; row < array2D2.length; row++) {
				int r = row;
				for (int col = 0; col < array2D2[row].length; col++) {
					int c = col;
					System.out.println("row=" + r + " " + " col=" + c + " " + array2D2[row][col]);

				}

			}
		}
	}

}
