package com.codingdojo.web.models;

public abstract class Animal {
	String nombre = "";
	String raza = "";
	int peso;
	
    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public int getPeso() {
        return peso;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
	public int setPeso(int peso) {
        return peso;
	}
	public Animal() {
	}
	public Animal(String nombre, String raza, int peso) {
		this.nombre=nombre;
		this.raza=raza;
		this.peso=peso;
	}
}