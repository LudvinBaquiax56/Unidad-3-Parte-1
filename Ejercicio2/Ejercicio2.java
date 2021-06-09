import java.util.*;

public class Ejercicio2 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		String capital;
		String pais;

		System.out.println("Ingrese el pais");
		pais = scanner.nextLine();
		System.out.println("Ingrese la capital de " + pais);
		capital = scanner.nextLine();
		System.out.println(capital + " es la capital de " + pais);
	}

}

