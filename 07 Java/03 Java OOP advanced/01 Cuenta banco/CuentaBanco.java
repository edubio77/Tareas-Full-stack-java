import java.util.Random;
import java.util.Scanner;
public class CuentaBanco { 
	private String numeroCuenta = "";
	private double saldoCorriente = 0.0;
	private double saldoAhorros = 0.0;
	private double giroCorriente = 0.0;
	private double giroAhorro = 0.0;
	private static int numeroCuentas = 0;
	private static int ahorroCuenta = 0; // rastree la cantidad de dinero almacenado en cada cuenta creada
	//Crear un método privado que retorne un número de 10 dígitos aleatorios 
	//para el número de cuenta
	private void generarNumeroCuenta() {
		String numeros = "1234567890";
		String numeroRandom = "";
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			char numero = numeros.charAt(random.nextInt(10));
			numeroRandom+= numero;
		}
		numeroCuenta = numeroRandom;
    }  
	//CONSTRUTOR
	public CuentaBanco() {
		this.numeroCuenta = numeroCuenta;
		this.saldoCorriente = 0.0;
		this.saldoAhorros = 0.0;
		this.giroCorriente = 0.0;
		this.giroAhorro = 0.0;
		numeroCuentas++;		
    }
	//GETTERS Y SETTERS - REINICIAR LOS VALORES
	//Crear un método getter para el saldo de la cuenta corriente del usuario.
	//Crear un método getter para el saldo de la cuenta de ahorros del usuario.
	//setter
	public void setSaldoCorriente(double saldoCorriente) {
	this.saldoCorriente = saldoCorriente;
	}
	//setter
	public void setSaldoAhorros(double saldoAhorros) {
	this.saldoAhorros = saldoAhorros;
	}
	// getter
	public double getSaldoCorriente() {
        return saldoCorriente;
    }
    // getter
    public double getSaldoAhorros() {
        return saldoAhorros;
    } 

    //Crear un método que permita al usuario depositar dinero en su cuenta corriente o cuenta de ahorros,
    //asegúrese de aumentar el total de dinero almacenado.
    public void depositarAhorro(double depositoAhorro) {
    	setSaldoAhorros(getSaldoAhorros()+depositoAhorro);
    	System.out.println("Tu saldo ahorro es: "+this.saldoAhorros);
    }


    public void depositarCorriente(double depositoCorriente) {
    	setSaldoCorriente(getSaldoCorriente()+depositoCorriente);
    	System.out.println("Tu saldo corriente es: "+this.saldoCorriente);
    }

    //Crear un método para retirar dinero de una cuenta. 
    //No permita que retire dinero si tiene fondos insuficientes.

    public void girarCorriente(double giroCorriente) {
    
    	if(getSaldoCorriente()-giroCorriente>0 ) {
    	setSaldoCorriente(getSaldoCorriente()-giroCorriente);
    	System.out.println("Tu saldo corriente es: "+this.saldoCorriente);
    	}
    	else {
    	System.out.println("Saldo insuficiente");
    	}
    }

    public void girarAhorro(double giroAhorro) {
    	if(getSaldoAhorros()-giroAhorro>0 ) {
    	setSaldoAhorros(getSaldoAhorros()-giroAhorro);
    	System.out.println("Tu saldo ahorro es: "+this.saldoAhorros);
    	}
    	else {
    	System.out.println("Saldo insuficiente");
    	}
    }  
    //Crear un método para ver el total de dinero en la cuenta corriente 
    //y en la cuenta de ahorros.
    public void saldoAhorros() {
    	System.out.print("Su saldo ahorro es de: "+this.saldoAhorros);
    } 
    
    public void saldoCorriente() {
    	System.out.print("Su saldo corriente es de: "+this.saldoCorriente);
    }
 }
//javac CuentaBanco.java
