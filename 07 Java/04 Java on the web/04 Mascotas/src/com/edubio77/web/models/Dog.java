package com.edubio77.web.models;

public class Dog extends Animal implements Pet{
	
	public Dog() {
	}
	
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
		
	public String showAffection() {
		
		if(getWeight()>30) {
			return this.getName()+" se ha acurrucado a tu lado";
			}
	    	else {
	    	return this.getName()+" se ha recostado en tu regazo";
	    	}
		
	}

}
