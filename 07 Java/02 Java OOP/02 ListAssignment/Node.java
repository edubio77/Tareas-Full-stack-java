public class Node { //Crear una clase Nodo 
    public int value;
    public Node next;
    
 //Establecer en el m�todo constructor value con un n�mero dado y 
 //next de tipo Nodo en null.
    public Node(int value) {
       this.value = value;
       this.next = null;
    }


}
//javac Node.java