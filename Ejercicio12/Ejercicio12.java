import java.util.*;

public class Ejercicio12 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double celsius;
		double fahrenheit;
		System.out.println("Ingrese la temperatura en grados Celsius");
		celsius = scanner.nextDouble();
		fahrenheit = celsius*1.8+32;
		System.out.println("El valor de "+celsius+" en Fahrenheit es "+fahrenheit);
	}

}

