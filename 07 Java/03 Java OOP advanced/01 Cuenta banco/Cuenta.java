package com.eduardo.cuentabanco;

import java.util.Random;

public class Cuenta {
	private String numeroCuenta;
    private double saldocuentacorriente;
    private double saldocuentaahorro;
    
	//Crear una variable (static) que contenga el n�mero de cuentas creadas hasta el momento.
    public static int numeroDeCuentas = 0;
    
	
    //Crear un m�todo privado que retorne un n�mero de 10 d�gitos aleatorios para el n�mero de cuenta.
    private String numeroCuenta(String string) {
    	String numeros = "1234567890";
		String numeroRandom = "";
		Random random = new Random();
			for(int i = 0; i < 10; i++) {
				char numero = numeros.charAt(random.nextInt(10));
				numeroRandom+= numero;
			}
		numeroCuenta = numeroRandom;
		return numeroCuenta;
	}
	
	//Metodo constructor
	public Cuenta() {
        this.saldocuentacorriente = 0.0;
        this.saldocuentaahorro = 0.0;
        this.numeroCuenta("");   //Llamar al m�todo desde el constructor
        numeroDeCuentas++;
    }
	
	//setter and getters
	public double getSaldocuentacorriente() {
		return saldocuentacorriente;
	}
	public void setSaldocuentacorriente(double saldocuentacorriente) {
		this.saldocuentacorriente = saldocuentacorriente;
	}
	public double getSaldocuentaahorro() {
		return saldocuentaahorro;
	}
	public void setSaldocuentaahorro(double saldocuentaahorro) {
		this.saldocuentaahorro = saldocuentaahorro;
	}
	
	//Crear un m�todo que permita al usuario depositar dinero en su cuenta corriente o
	//cuenta de ahorros, aseg�rese de aumentar el total de dinero almacenado.

	public void depositarAhorro(double depositoAhorro) {
		setSaldocuentaahorro(getSaldocuentaahorro()+depositoAhorro);
    	System.out.println("Tu saldo ahorro de la cuenta "+this.numeroCuenta+" es:"+this.saldocuentaahorro);
	}
	
	public void depositarCorriente(double depositoCorriente) {
		setSaldocuentacorriente(getSaldocuentacorriente()+depositoCorriente);
    	System.out.println("Tu saldo ahorro de la cuenta "+this.numeroCuenta+" es: "+this.saldocuentacorriente);
	}
	
	//Crear un m�todo para retirar dinero de una cuenta. No permita que retire dinero si tiene fondos insuficientes.
	public void retirarAhorro(double retiroAhorro) {
		if(getSaldocuentaahorro()-retiroAhorro>0) {
		setSaldocuentaahorro(getSaldocuentaahorro()-retiroAhorro);
		System.out.println("Tu saldo ahorro de la cuenta "+this.numeroCuenta+" es:"+this.saldocuentaahorro);
		}
    	else {
    	System.out.println("El Saldo de la cuenta de ahorro "+this.numeroCuenta+" es insuficiente");
    	}
	}
		
	public void retirarCorriente(double retiroCorriente) {
		if(getSaldocuentacorriente()-retiroCorriente>0) {
		setSaldocuentaahorro(getSaldocuentacorriente()-retiroCorriente);
		System.out.println("Tu saldo corriente de la cuenta "+this.numeroCuenta+" es:"+this.saldocuentacorriente);
		}
    	else {
    	System.out.println("El Saldo de la cuenta corriente "+this.numeroCuenta+" es insuficiente");
    	}
	}
	
	//Crear un m�todo para ver el total de dinero en la cuenta corriente y en la cuenta de ahorros.
    public void saldoAhorro() {
    	System.out.print("Tu saldo ahorro de la cuenta "+this.numeroCuenta+" es: "+this.saldocuentaahorro);
    } 
    
    public void saldoCorriente() {
    	System.out.print("Tu saldo corriente de la cuenta "+this.numeroCuenta+" es: "+this.saldocuentacorriente);
    }
}
