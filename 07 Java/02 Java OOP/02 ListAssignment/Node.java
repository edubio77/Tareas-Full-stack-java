public class Node { //Crear una clase Nodo 
    public int value;
    public Node next;
    
 //Establecer en el método constructor value con un número dado y 
 //next de tipo Nodo en null.
    public Node(int value) {
       this.value = value;
       this.next = null;
    }


}
//javac Node.java