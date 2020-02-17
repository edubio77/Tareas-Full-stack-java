import java.util.ArrayList;
import java.util.Collections;

public class JavaBasico{
//EJERCICIO 01
    public void todos(){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }
  //EJERCICIO 02
    public void impares(){
        for(int i = 1; i < 256; i+=2){
            System.out.println(i);
        }
    }
  //EJERCICIO 03
    public void imprimirSuma(){
        int sum = 0;
        for(int i = 0; i < 256; i++){
            sum = sum+ i;
            System.out.println("Nuevo numero: " + i + " Suma: " + sum);
        }
    }
  //EJERCICIO 04
    public void recorrerArrglo(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
  //EJERCICIO 05
    public void encontrarMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
  //EJERCICIO 06
    public void obtenerPromedio(int[] arr){
        float sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum+ arr[i];
        }
        System.out.println(sum/arr.length);
    }
  //EJERCICIO 07
    public void arregloImpares(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i < 256; i+=2){
            y.add(i);
        }
        System.out.println(y);
    }
  //EJERCICIO 08
    public void mayorQueY(int[] arr, int y){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                sum++;
            }
        }
        System.out.println(sum);
    }
  //EJERCICIO 09
    public void valoresCuadrado(int[] y){
        ArrayList<Integer> h = new ArrayList<Integer>();
        for(int i = 0; i < y.length; i++){
            y[i] = y[i] * y[i];
            h.add(y[i]);
        }
        System.out.println(h);
    }
  //EJERCICIO 10
    public void eliminaNegativo(int[] d){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < d.length; i++){
            if(d[i] < 0){
                d[i] = 0;
            }
        newArray.add(d[i]);
        }
        System.out.println(newArray);
    }
  //EJERCICIO 11
    public void maxMinMed(int[] k){
        ArrayList<Integer> Array2 = new ArrayList<Integer>();
        int max = k[0];
        int min = k[0];
        int sum = 0;
        for(int i = 0; i < k.length; i++){
            if(k[i] > max){
                max = k[i];
                Array2.add(max);
            }
            if(k[i] < min){
                min = k[i];
                Array2.add(min);
            }
            sum = sum+ k[i];
        }
        int med = sum/k.length;     
        Array2.add(med);
        System.out.println(Array2);
    }
  //EJERCICIO 12
    public void cambiandoValores(int[] y){
    	ArrayList<Integer> Array3 = new ArrayList<Integer>();
        int t = 0;
    	for(int i = 1; i < y.length; i++){
        	Array3.add(y[i]);
            }
        Array3.add(t);
        System.out.println(Array3);
    }
}
//javac JavaBasico.java