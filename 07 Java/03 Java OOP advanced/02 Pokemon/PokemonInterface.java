public interface PokemonInterface {
    // Este m�todo crea y retorna un Pokemon.  
	Pokemon createPokemon(String name, String type,int health);
	//Este m�todo devuelve un string con el name, health, y type del Pokemon.
	void pokemonInfo(Pokemon pokemon);
	//Lista el nombre de todos los Pokemones que tienes en la Pokedex.
	void listPokemon();
 }
//javac PokemonInterface.java
