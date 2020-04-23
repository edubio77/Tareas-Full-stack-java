package com.eduardo.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	
	
	//Una variable static count para mantener el número de Pokemones creados en el programa.
	public static int count = 0;
	
	//Getter y Setter para cada variable principal.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//Un constructor para establecer name, health y type en la creación de la instancia.
	public Pokemon(String name, String type, int health) {
		setName(name);
		setHealth(health);
		setType(type);
		count++;
    }
	
	//Este método reduce la salud del Pokemon atacado en 10 puntos.
		public void attackPokemon(Pokemon pokemon) {
			pokemon.setHealth(pokemon.getHealth()/2);
	    	System.out.println("El nivel de salud del pokemon es " +pokemon.health);
		}
	
}
