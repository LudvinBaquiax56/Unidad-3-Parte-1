import java.util.*;

public class Ejercicio16 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		System.out.println("Ingrese el primer numero");
		numero1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2 = scanner.nextInt();
		System.out.println("Ingrese el tercer numero");
		numero3 = scanner.nextInt();
		if (numero1 > numero2) {
			if (numero1 > numero3) {
				System.out.println("El numero mayor es " + numero1);
			} else {
				System.out.println("El numero mayor es " + numero3);
			}
		} else {
			if (numero2 > numero3) {
				System.out.println("El numero mayor es " + numero2);
			} else {
				System.out.println("El numero mayor es " + numero3);
			}
		}
	}

}

