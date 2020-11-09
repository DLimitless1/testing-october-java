package com.cognixia.jump.corejava.classes;

public class NatureDriver {

	public static void main(String[] args) {
		
		// Default constructor - when it's not defined in the class
		Animal animal = new Animal();
		Animal animal2 = new Animal("Reptile", 1.0, 1, true, true);
		Animal animal3 = new Animal("Mamal");
		Animal animal4 = new Animal("Fish");
		
		System.out.println("First animal type;" + animal.getType());
		System.out.println(animal2.getType());
		animal.setType("Bird");
		System.out.println("First animal type: " + animal.getType());

		animal3.sound("Woof");
		String storage = animal3.getType();
		System.out.println(Animal.count); // it is counting the "animals we made at the top
		Animal.printAnimals();
		
		//Inheritance
		Dog dog = new Dog();
		dog.setType("Maltese");
		System.out.println(dog.getType());
		
		Dog dog1 = new Dog("Maltese", "dog", 10, 1, true, true);
		System.out.println(dog1.getType());
		dog1.sound("woof");
	}

}

	// Methods
	// Getters and Setters

	
// toString