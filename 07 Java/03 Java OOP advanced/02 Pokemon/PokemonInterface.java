public interface PokemonInterface {
    // Este método crea y retorna un Pokemon.  
	Pokemon createPokemon(String name, String type,int health);
	//Este método devuelve un string con el name, health, y type del Pokemon.
	void pokemonInfo(Pokemon pokemon);
	//Lista el nombre de todos los Pokemones que tienes en la Pokedex.
	void listPokemon();
 }
//javac PokemonInterface.java
