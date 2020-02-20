public class Bat extends Mammal{ 
	
	public Bat() {
		this.nivelEnergia = 300;
		}
    
 	public void fly() {
		nivelEnergia -=50; //baja el nivel cada vez que se llama este metodo
		System.out.println("sonido que hace el Bat al despegar????"); //devuelve mensaje
		displayEnergy();
	}
	
	public void eatHumans() {
		nivelEnergia +=25; //sube el nivel cada vez que se llama este metodo
		System.out.println("bueno, no importa"); //devuelve mensaje
		displayEnergy();	
	}

	public void attackTown() {
		nivelEnergia -=100; //sube el nivel cada vez que se llama este metodo
		System.out.println("sonido de la ciudad en llamas????"); //devuelve mensaje
		displayEnergy();
	}
}

//javac Bat.java