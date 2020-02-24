public class CalculadoraITest {
    public static void main(String[] args) {
    	CalculadoraI operacion1 = new CalculadoraI(2.0,"+",3.1);
    	operacion1.performOperation();
    	operacion1.getResult();
    	CalculadoraI operacion2 = new CalculadoraI(2.0,"-",3.1);
    	operacion2.performOperation();
    	operacion2.getResult();
    	//operacion.performOperation("-",5.0,2.0);
    	
    }
}
//javac CalculadoraITest.java
//java CalculadoraITest
