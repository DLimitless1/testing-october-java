package com.cognixia.jump.corejava.classes;

public class Patients {

	// Attributes
	String name = " ";
	int tempurature = 0;
	int height = 0;
	int weight = 0;
	String bloodtype = "A+ || A- || B+ || B- || O+ || O- || AB+ || AB-";
	boolean isSick;

	// Constructor
	public Patients() {
		this.name = "";
		this.tempurature = 0;
		this.height = 0;
		this.weight = 0;
		this.bloodtype = "";
		this.isSick = false;
	}

	// Overloaded Constructor(just another option)
	public Patients(String name, int tempurature, int height, int weight, String bloodtype, boolean sick) {
		this.name = "";
		this.tempurature = tempurature;
		this.height = 0;
		this.weight = 0;
		this.bloodtype = "";
		this.isSick = sick;
	}
	// Methods
	@Override
	public String toString() {
		return "Patients [name=" + name + ", tempurature=" + tempurature + ", height=" + height + ", weight=" + weight
				+ ", bloodtype=" + bloodtype + ", isSick=" + isSick + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTempurature() {
		return tempurature;
	}

	public void setTempurature(int tempurature) {
		this.tempurature = tempurature;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(String bloodtype) {
		this.bloodtype = bloodtype;
	}

	public boolean isSick() {
		return isSick;
	}

	public void setSick(boolean isSick) {
		this.isSick = isSick;
	}

}
