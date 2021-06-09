import java.util.*;

public class Ejercicio4 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int cuadrado;
		int cubo;
		int numero1;
		System.out.println("El numero para obtener su cuadrado y su cubo");
		numero1 = scanner.nextInt();
		cuadrado = numero1*numero1;
		cubo = numero1*numero1*numero1;
		System.out.println("El cuadrado del "+numero1+" es "+cuadrado);
		System.out.println("El cubo del "+numero1+" es "+cubo);
	}

}

