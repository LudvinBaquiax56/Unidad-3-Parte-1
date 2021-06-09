import java.util.*;

public class Ejercicio10 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int altura;
		int base;

		int area;
		int perimetro;

		System.out.println("Ingrese la base del rectangulo");
		base = scanner.nextInt();
		System.out.println("Ingrese la altura del rectangulo");
		altura = scanner.nextInt(); 
		area = base * altura;
		perimetro = 2 * base + 2 * altura;
		System.out.println("El area del rectangulo es " + area);
		System.out.println("El perimetro del rectangulo es " + perimetro);
	}

}

