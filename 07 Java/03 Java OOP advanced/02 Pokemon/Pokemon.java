public class Pokemon { 
	private String name;
	private int health = 0;
	private String type;
		
	//GETTERS Y SETTERS
	// getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
	// getter
    public String getType() {
        return type;
    }
    // setter
    public void setType(String type) {
        this.type = type;
    }
	// getter
    public int getHealth() {
        return health;
    }
    // setter
    public void setHealth(int health) {
        this.health = health;
    }
    
	//CONSTRUTOR
	public Pokemon(String name, String type, int health) {
		setName(name);
		setHealth(health);
		setType(type);
	}
    //Este método reduce la salud del Pokemon atacado en 10 puntos.
    public void attackPokemon(Pokemon pokemon) {
    	pokemon.setHealth(pokemon.getHealth()-10);
    	System.out.println("El nivel de vida del pokemon es: "+pokemon.health);
    }
 }
//javac Pokemon.java
