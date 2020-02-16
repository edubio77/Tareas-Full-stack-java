import java.util.Scanner;
public class Pitagoras {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    	System.out.print("Ingresa el valor del primer cateto: ");
    	int a = input.nextInt();
    	System.out.print("Ingresa el valor del segundo cateto: ");
    	int b = input.nextInt();
        double c = Math.sqrt(a*a+b*b);

      System.out.println("El valor de la hipotenusa es " + c);
    }
}