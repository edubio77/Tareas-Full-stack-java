public class Gorilla extends Mammal{ 
    
 	public void throwSomething() {
		nivelEnergia -=5; //baja el nivel cada vez que se llama este metodo
		System.out.println("El gorila ha lanzado un platano"); //devuelve mensaje
		displayEnergy();
	}
	
	public void eatBananas() {
		nivelEnergia +=10; //sube el nivel cada vez que se llama este metodo
		System.out.println("El gorila ha comido un platano"); //devuelve mensaje
		displayEnergy();	
	}

	public void climb() {
		nivelEnergia -=10; //sube el nivel cada vez que se llama este metodo
		System.out.println("El gorila ha escalado"); //devuelve mensaje
		displayEnergy();
	}
}

//javac Gorilla.java