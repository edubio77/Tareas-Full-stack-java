public class CuentaBancoTest {
    public static void main(String[] args) {
    	CuentaBanco cuenta1 = new CuentaBanco();
    	CuentaBanco cuenta2 = new CuentaBanco();
    	CuentaBanco cuenta3 = new CuentaBanco();
    	//CuentaBancoTest cuenta2 = new CuentaBanco();
        cuenta1.depositarAhorro(20.00);
        cuenta1.girarAhorro(30.00);
        cuenta1.depositarCorriente(40.00);
        cuenta1.girarCorriente(30.00);
        cuenta1.saldoAhorros();
        cuenta1.saldoCorriente();
    }
}
//javac CuentaBancoTest.java
//java CuentaBancoTest
