public class Human { 
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	int health = 100;
	
 //GETTERS Y SETTERS - REINICIAR LOS VALORES
    // getter
	public int getStrength() {
        return strength;
    }
    // setter
    public void setStrength(int strength) {
        this.strength = strength;
    }
    // getter
    public int getHealth() {
        return health;
    }
    // setter
    public void setHealth(int health) {
        this.health = health;
    }
 // getter
    public int getIntelligence() {
        return intelligence;
    }
    // setter
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
 // getter
    public int getStealth() {
        return stealth;
    }
    // setter
    public void setStealth(int stealth) {
        this.stealth = stealth;
    }
 
 //CONSTRUCTORES
    public Human() {
    	this.strength = 3;
    	this.health = 100;
    	this.intelligence = 3;
    	this.stealth = 3;
    }
    
 //metodo ataque
    public void attack(Human humano) {
    	System.out.println("Te atacaron");
    	humano.setHealth(humano.getHealth()-strength);
    	System.out.println("El nivel de salud es de: "+humano.health);
    }    
}
//javac Human.java