public class PokemonTest {
    public static void main(String[] args) {
    	Pokedex pokedex = new Pokedex();
		Pokemon pokemonA = pokedex.createPokemon("A", "A1", 200);
		Pokemon pokemonB = pokedex.createPokemon("B", "B1", 120);
		pokedex.pokemonInfo(pokemonA);
		pokedex.pokemonInfo(pokemonB);
		pokemonA.attackPokemon(pokemonB);
		pokedex.listPokemon();
    }
}
//javac PokemonTest.java
//java PokemonTest
