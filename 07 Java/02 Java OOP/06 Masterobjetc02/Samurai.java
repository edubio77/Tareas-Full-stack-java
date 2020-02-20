public class Samurai extends Human{ 
	
	public Samurai() {
		this.health = 200;
		}
	
	//Agregar un método deathBlow(Human) que asesina al otro Human 
	//y reduce la health del Samurai a la mitad.
	public void deathBlow(Samurai humano) {
    	System.out.println("Ataque deathBlow");
    	humano.setHealth(humano.getHealth()-humano.getHealth());
    	setHealth(this.health/2);
    	System.out.println("El nivel de salud es del humano es: "+humano.health+" .Esta muerto.");
    	System.out.println("El nivel de salud es del Samurai es: "+this.health);
    }  
	
	// Agregar un método meditate() que curará al Samurai en la mitad 
	//de puntos que tenga de health.
	public void meditate() {
		System.out.println("El samurai esta meditando");
		setHealth(this.health+this.health/2);
    	System.out.println("El nivel de salud es del Samurai es: "+this.health);
    }
	
}
//javac Samurai.java