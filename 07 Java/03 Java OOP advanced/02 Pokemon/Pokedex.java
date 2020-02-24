import java.util.ArrayList;
import java.util.*; 
public class Pokedex extends AbstractPokemon {
//Crear una clase Pokedex que extienda de la clase abstracta anterior e 
//implemente listPokemon(). Su clase Pokedex necesita un atributo llamado 
//myPokemons donde usted tendrá el número de Pokemones creados.
	int myPokemons = 0;
	
	public void listPokemon(){
            myPokemons++;
        }
}
//javac Pokedex.java
