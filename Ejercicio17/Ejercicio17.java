import java.util.*;

public class Ejercicio17 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int lado1;
		int lado2;
		int lado3;
		System.out.println("Ingrese el primer lado");
		lado1 = scanner.nextInt();
		System.out.println("Ingrese el segundo lado");
		lado2 = scanner.nextInt();
		System.out.println("Ingrese el tercer lado");
		lado3 = scanner.nextInt();
		if (lado1==lado2 && lado1==lado3) {
			System.out.println("El trinagulo es EQUILATERO");
		} else {
			if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
				System.out.println("El trinagulo es ISOSELES");
			} else {
				System.out.println("El triangulo es ESCALENO");
			}
		}
	}

}

