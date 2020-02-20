public class Wizard extends Human{ 
	
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
		}
	
	//Agregar un método heal(Human) que aumentará la salud del otro 
	//Human en los puntos de intelligence que tenga el Wizard.
	public void heal(Wizard humano) {
    	System.out.println("haz sanado");
    	humano.setHealth(humano.getHealth()+this.intelligence);
    	System.out.println("El nivel de salud es de: "+humano.health);
    }  
	
	//Agregar un método fireBall(Human) que disminuye la salud del otro 
	//Human en los puntos de intelligence * 3 que tenga el Wizard.
	public void fireBall(Wizard humano) {
    	System.out.println("haz sido atacado por la bola de fuego");
    	humano.setHealth(humano.getHealth()-3*this.intelligence);
    	System.out.println("El nivel de salud es de: "+humano.health);
    }
}
//javac Wizard.java