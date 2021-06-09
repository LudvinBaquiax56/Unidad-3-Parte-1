import java.util.*;

public class Ejercicio15 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero1;
		System.out.println("Ingrese el numero a validar");
		numero1 = scanner.nextInt();
		if (numero1==0) {
			System.out.println("El "+numero1+" es nulo");
		} else {
			if (numero1>0) {
				System.out.println("El "+numero1+" es positivo");
			} else {
				System.out.println("El "+numero1+" es negativo");
			}
		}
	}

}

