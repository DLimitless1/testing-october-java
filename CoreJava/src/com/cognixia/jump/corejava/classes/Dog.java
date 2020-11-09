package com.cognixia.jump.corejava.classes;
// Inheritance: Dog extends from animal

public class Dog extends Animal {
	
	private String breed;
	// the object existing in another class is composition
	private MicroChip chip;
	
	public Dog() {
		super("", 0, 0, true, false);
		this.breed = "";
		chip = new MicroChip();
	}

	public Dog(String breed) {
		super("", 0, 0, true, false);
		this.breed = breed;
		chip = new MicroChip();
	}
	public Dog(String breed, String type, double weight, double height, boolean isDomestic, boolean isPredator) {
		super(type, weight, height, isDomestic, isPredator);
		this.breed = breed;
		chip = new MicroChip();
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	//Method
	//method override - runtime polymorphism
	
	public MicroChip getChip() {
		return chip;
	}

	public void setChip(MicroChip chip) {
		this.chip = chip;
	}

	@Override
	//a self check
	public void sound(String noise) {
		System.out.println("A dog goes: " + noise);
	}
}
