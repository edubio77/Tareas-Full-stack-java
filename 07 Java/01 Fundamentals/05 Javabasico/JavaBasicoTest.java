public class JavaBasicoTest {
    public static void main(String[] args) {
    JavaBasico pruebaBasico = new JavaBasico();
    int[] Arr01 = {6,7,-1,0,4,-2};
    int[] Arr02 = {6,7,-1,0,4,-2};
    int[] Arr03 = {6,7,-1,0,4,-2};
    int[] Arr04 = {6,7,-1,0,4,-2};
  //EJERCICIO 01
    pruebaBasico.todos();
  //EJERCICIO 02
    pruebaBasico.impares();
  //EJERCICIO 03
    pruebaBasico.imprimirSuma();
  //EJERCICIO 04
    pruebaBasico.recorrerArrglo(Arr01);
  //EJERCICIO 05
    pruebaBasico.encontrarMax(Arr01);
  //EJERCICIO 06
    pruebaBasico.obtenerPromedio(Arr01);
  //EJERCICIO 07
    pruebaBasico.arregloImpares();
  //EJERCICIO 08
    pruebaBasico.mayorQueY(Arr01, 2);
  //EJERCICIO 09
    pruebaBasico.valoresCuadrado(Arr01);
  //EJERCICIO 10
    pruebaBasico.eliminaNegativo(Arr02);
  //EJERCICIO 11
    pruebaBasico.maxMinMed(Arr03);
  //EJERCICIO 12
    pruebaBasico.cambiandoValores(Arr04);
    }
}

//javac JavaBasicoTest.java
//java JavaBasicoTest