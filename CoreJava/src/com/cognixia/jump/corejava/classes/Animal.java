package com.cognixia.jump.corejava.classes;

public class Animal {

	// Attributes
	private String type;
	private double weight;
	private double height;
	private boolean isDomestic;
	private boolean isPredator;
	
	// Static Attribute
	public static int count = 0;
	
	
	// Constructors - also show absent /default constructor
	public Animal() {
		this.type = "";
		this.weight = 0;
		this.height = 0;
		this.isDomestic = false;
		this.isPredator = false;
		count++;
	}

	public Animal(String type, double weight, double height, boolean isDomestic, boolean isPredator) {
		super();
		this.type = type;
		this.weight = weight;
		this.height = height;
		this.isDomestic = isDomestic;
		this.isPredator = isPredator;
		count++;
	}

	public Animal(String type) {
		super();
		this.type = type;
		this.weight = 0;
		this.height = 0;
		this.isDomestic = false;
		this.isPredator = false;
		count++;
	}
	// Methods
	
	public void sound(String noise) {
		System.out.println("Animal sound is " + noise);
	}
	
		// Getters and Setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isDomestic() {
		return isDomestic;
	}

	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

	public boolean isPredator() {
		return isPredator;
	}

	public void setPredator(boolean isPredator) {
		this.isPredator = isPredator;
	}
	public static void printAnimals() {
		System.out.println("Animals");
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", weight=" + weight + ", height=" + height + ", isDomestic=" + isDomestic
				+ ", isPredator=" + isPredator + "]";
	}	
	
	// toString
	
}
