package com.codingdojo.web.models;

public class Cat extends Animal implements Pet{
	public Cat() {
		super("null","null",0);
	}
	public Cat(String nombre, String raza, int peso) {
		super(nombre, raza, peso);
	}
	public String showAffection() {
		return "Tu gato "+nombre+" te ha mostrado un poco de afecto";
	}
}