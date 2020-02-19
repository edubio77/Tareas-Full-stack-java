import java.util.*;

public class ListaExcepciones{
    public void excepciones(){  
    	ArrayList<Object> myList = new ArrayList<Object>();
    	myList.add("13");
    	myList.add("Hola Mundo");
    	myList.add(48);
    	myList.add("Adios Mundo");
    	
    	try {
            for(int i = 0; i < myList.size(); i++){
                Integer castedValue = (Integer) myList.get(i);
            } 
        } catch(ClassCastException e) {
            System.out.println("Existen errores en el codigo");
        }
    }
}
//javac ListaExcepciones.java