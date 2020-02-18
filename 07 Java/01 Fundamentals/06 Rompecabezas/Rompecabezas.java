import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Rompecabezas {
//ARREGLO 01
    public static void arregloPrimero(int[] arr) {
    	ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum+ arr[i];
            if(arr[i] > 10){
                newArray.add(arr[i]);
            } 
        }
        System.out.println(sum);
        System.out.println(newArray);
    }
//ARREGLO 02
    public static void arregloSegundo() {
    	ArrayList<String> StringArr = new ArrayList<String>();
        ArrayList<String> MayorQue = new ArrayList<String>();
        StringArr.add("Nancy");
        StringArr.add("Jinichi");
        StringArr.add("Fujibayashi");
        StringArr.add("Momochi");
        StringArr.add("Ishikawa");
        Collections.shuffle(StringArr);
        System.out.println(StringArr);
        
        for (int i = 0; i < StringArr.size(); i++) {
            if (StringArr.get(i).length() > 5) {
                MayorQue.add(StringArr.get(i));
            }
        }
        System.out.println(MayorQue);
    	
    }
//ARREGLO 03
	public static void arregloTercero() {
		ArrayList<String> Alfabeto = new ArrayList<String>();
        Alfabeto.add("a");
        Alfabeto.add("b");
        Alfabeto.add("c");
        Alfabeto.add("d");
        Alfabeto.add("e");
        Alfabeto.add("f");
        Alfabeto.add("g");
        Alfabeto.add("h");
        Alfabeto.add("i");
        Alfabeto.add("j");
        Alfabeto.add("k");
        Alfabeto.add("l");
        Alfabeto.add("m");
        Alfabeto.add("n");
        Alfabeto.add("o");
        Alfabeto.add("p");
        Alfabeto.add("q");
        Alfabeto.add("r");
        Alfabeto.add("s");
        Alfabeto.add("t");
        Alfabeto.add("u");
        Alfabeto.add("v");
        Alfabeto.add("w");
        Alfabeto.add("x");
        Alfabeto.add("y");
        Alfabeto.add("z");
        Collections.shuffle(Alfabeto);
        System.out.println(Alfabeto);
        
        String ultima = Alfabeto.get(0);
        if("aeiou".indexOf(ultima) > 0){
            System.out.println("Una vocal");
            } 
	    }
//ARREGLO 04
	public static void arregloCuarto() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int random = ThreadLocalRandom.current().nextInt(55, 101);
            numeros.add(random);
        }
        System.out.println(numeros);
	}
//ARREGLO 05
	public static void arregloQuinto() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int random = ThreadLocalRandom.current().nextInt(55, 101);
            numeros.add(random);
        }
        Collections.sort(numeros);
        System.out.println(numeros);
	}
//ARREGLO 06
	public static void arregloSexto() {
		String result = "";
        String caracteres = "abcdefghijklmnopqrstuvwxyz1234567890";
        for(int i = 0; i < 5; i++){
            int random = ThreadLocalRandom.current().nextInt(0, 35);
            char caracter = caracteres.charAt(random);
            String str = String.valueOf(caracter);
            result += str;
            if (result.length()>4){
                System.out.println(result);
            }
        }
	}
//ARREGLO 07
	public static void arregloSeptimo(){
		ArrayList<String> StringArr = new ArrayList<String>();
        String result = "";
        String caracteres = "abcdefghijklmnopqrstuvwxyz1234567890";
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < 5; i++){
                int random = ThreadLocalRandom.current().nextInt(0, 35);
                char caracter = caracteres.charAt(random);
                String str = String.valueOf(caracter);
                result += str;
                    if (result.length()==5){
                        System.out.println(result);
                    }
                }
            }
            StringArr.add(result);
            System.out.println(StringArr);
	}
    
}
//javac Rompecabezas.java