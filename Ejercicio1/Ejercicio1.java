import java.util.*;

public class Ejercicio1 {

    public static void main (String[] args){
        int valorA;
        int valorB;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero a sumar: ");
        valorA = scanner.nextInt();
        System.out.println("Ingrese el segundo numero a sumar: ");
        valorB = scanner.nextInt();

        int suma = valorA + valorB;
        System.out.println("La suma es: " + suma);
    }
}