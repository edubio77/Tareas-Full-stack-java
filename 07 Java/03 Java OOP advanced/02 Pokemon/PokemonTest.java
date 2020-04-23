package com.eduardo.pokemon;


public class PokemonTest {
		 public static void main(String[] args) {
			 Pokedex pokedex = new Pokedex();
			 Pokemon pokemonA = pokedex.createPokemon("A", "A1", 200);
			 Pokemon pokemonB = pokedex.createPokemon("B", "B1", 120);
			 Pokemon pokemonC = pokedex.createPokemon("C", "C1", 180);
			 pokedex.pokemonInfo(pokemonA);
			 pokedex.pokemonInfo(pokemonB);
			 pokedex.pokemonInfo(pokemonC);
			 pokemonB.attackPokemon(pokemonA);
			 //pokedex.listPokemon();
			 System.out.println(Pokemon.count);
			 //System.out.println(Pokemon.listPokemon());
		 }
}
