package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{
	public Dog() {
		super("null","null",0);
	}
	public Dog(String nombre, String raza, int peso) {
		super(nombre, raza, peso);
	}
	public String showAffection() {
		if(peso>30) {
			return "Tu perro "+nombre+" se ha acurrucado a tu lado";
		}
		else {
			return "Tu perro "+nombre+" se ha apoyado en tu regazo";
		}
	}
}
