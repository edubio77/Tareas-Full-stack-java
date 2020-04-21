package com.eduardo.cuentabanco;

public class CuentaTest {
		 public static void main(String[] args) {
		    	Cuenta cuenta1 = new Cuenta();
		    	Cuenta cuenta2 = new Cuenta();
		    	Cuenta cuenta3 = new Cuenta();
		    	
		        cuenta1.depositarAhorro(20.00);
		        cuenta1.retirarAhorro(30.00);
		        cuenta1.depositarCorriente(40.00);
		        cuenta1.retirarCorriente(30.00);
		        cuenta1.saldoAhorro();
		        cuenta1.saldoCorriente();
		        
		        cuenta2.depositarAhorro(20.00);
		        cuenta2.retirarAhorro(30.00);
		        cuenta2.saldoAhorro();
		        cuenta2.saldoCorriente();
		        
		        cuenta3.depositarAhorro(20.00);
		        cuenta3.depositarAhorro(40.00);
		        cuenta3.depositarCorriente(40.00);
		        cuenta3.retirarAhorro(30.00);
		        cuenta3.saldoAhorro();
		        cuenta3.saldoCorriente();
		        
		        System.out.println(Cuenta.numeroDeCuentas);
		    }
	 }
