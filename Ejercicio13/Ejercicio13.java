import java.util.*;
import java.math.*;

public class Ejercicio13 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double altura = 0;
		double radio = 0;
		double volumen;
		do {
			if (radio<0) {
				System.out.println("Error numero ingresesado incorrecto");
			}
			System.out.println("Ingrese el radio del cilindro");
			radio = scanner.nextDouble();
		} while (radio<=0);
		do {
			if (altura<0) {
				System.out.println("Error numero ingresesado incorrecto");
			}
			System.out.println("Ingrese la altura del cilindro");
			altura = scanner.nextDouble();
		} while (altura<=0);
		volumen = Math.PI*radio*radio*altura;
		System.out.println("El volumen del cilindro es " + volumen);
	}

}

