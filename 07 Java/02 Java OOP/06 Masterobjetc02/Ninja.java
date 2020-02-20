public class Ninja extends Human{ 
	
	public Ninja() {
		this.stealth = 10;
		}
	
	//Agregar un método steal(Human) que roba la cantidad de puntos que tenga 
	//el Ninja en stealth de la salud del otro Human y los agrega a la health del Ninja.
	public void steal(Ninja humano) {
    	System.out.println("Te han robado vida");
    	humano.setHealth(humano.getHealth()-this.stealth);
    	setHealth(this.stealth+this.health);
    	System.out.println("El nivel de salud es del humano es: "+humano.health);
    	System.out.println("El nivel de salud es del ninja es: "+this.health);
    }  
	
	// Agregar un método runAway() que reduce su salud en 10.
	public void runAway(Ninja humano) {
		System.out.println("El ninja ha arrancado");
		setHealth(this.health-10);
    	System.out.println("El nivel de salud es del ninja es: "+this.health);
    }
}
//javac Ninja.java