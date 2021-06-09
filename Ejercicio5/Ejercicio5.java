import java.util.*;

public class Ejercicio5 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero1;
		int siguiente;
		System.out.println("Ingrese el numero para obtener su numero siguiente");
		numero1 = scanner.nextInt();
		siguiente = numero1+1;
		System.out.println("El numero siguiente de " + numero1 + " es " + siguiente);
	}

}
