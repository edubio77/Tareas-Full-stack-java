public class SinglyLinkedList { //Crear una clase SinlgyLinkedList 
    public Node head;
    
    //Crear un método constructor para 
    //establecer head en null para los objetos de su SinglyLinkedList.
    public SinglyLinkedList() {
    	this.head = null;
    }
    //Los metodos de la SLL van aqui. 
    //Cómo agregar nodos a la lista.
    public void add(int value) {  //metodo add
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }  
    
    //Crear un método remove() 
    //que removerá un nodo del final de su lista.
    public void remove(){
    	if(head.next == null){
            this.head = null;
        }
        Node runner = this.head;
        while(runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
    	
    }
    //Crear un método printValues() que mostrará en pantalla todos los 
     //valores de cada nodo de la lista en el mismo orden que fue creada.
    public void printValues(){
    	Node runner = this.head;
        if(head == null){
            System.out.println("No hay nodos");
        }
        while(runner.next != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
        System.out.println(runner.value);
    }
}

//javac SinglyLinkedList.java