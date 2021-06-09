import java.math.*;

public class Ejercicio19 {

	public static void main(String args[]) {
		int numero1 = (int) (Math.random() * 1000);
		System.out.println("El numero es " + numero1);
		if ((numero1 % 5 == 0) && (numero1 <= 5 * 25)) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
	}

}

