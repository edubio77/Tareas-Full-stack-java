import java.util.*; 
public abstract class AbstractPokemon implements PokemonInterface {
	//Este método crea y retorna un Pokemon.
	public Pokemon createPokemon(String name, String type, int health) {
		return new Pokemon(name, type, health);
	}
	//Este método devuelve un string con el name, health, y type del Pokemon
	public void pokemonInfo(Pokemon pokemon) {
//		String nombre = pokemon.getName();
//		AbstractList<String> listaPokemones = new LinkedList<String>();
//		//String pokemonLista = setName(name);
//		listaPokemones.add(nombre);
		System.out.println("Nombre: "+pokemon.getName()+" Nivel vida: "+pokemon.getHealth()+" Tipo: "+pokemon.getType());
	}
	
}
//javac AbstractPokemon.java
