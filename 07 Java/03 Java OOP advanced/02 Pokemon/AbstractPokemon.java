package com.eduardo.pokemon;
//import java.util.*;

public abstract class AbstractPokemon implements PokemonInterface {
	//implementa metodo createPokemon de PokemonInterface.
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
	}

	//implementa metodo pokemonInfo(Pokemon pokemon) de PokemonInterface.
	public void pokemonInfo(Pokemon pokemon){
		System.out.println("Nombre: "+pokemon.getName()+" Nivel vida: "+pokemon.getHealth()+" Tipo: "+pokemon.getType());
	
		//String nombre = pokemon.getName();
		//AbstractList<String> listaPokemones = new LinkedList<String>();
		//listaPokemones.add(nombre);
	}	
}
