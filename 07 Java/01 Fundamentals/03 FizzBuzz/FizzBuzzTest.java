import java.util.Scanner;
public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz tarea = new FizzBuzz();
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
    	int numero = input.nextInt();
        String respuesta = tarea.fizzBuzz(numero);
        System.out.println(respuesta);
    }
}