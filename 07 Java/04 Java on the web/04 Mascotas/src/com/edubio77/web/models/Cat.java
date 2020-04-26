package com.edubio77.web.models;

public class Cat extends Animal implements Pet{

	public Cat() {
	}
	
	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		return this.getName()+" te ha mirado y se ha ido";
	}

}
