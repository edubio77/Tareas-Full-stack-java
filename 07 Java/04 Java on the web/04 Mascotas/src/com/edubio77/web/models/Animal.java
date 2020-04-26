package com.edubio77.web.models;

public class Animal{
	private String name = "";
    private String breed = "";
    private int weight;
    
    //getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}	
	
	public Animal() {
    }

	public Animal(String name, String breed, int weight) {
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }

}
