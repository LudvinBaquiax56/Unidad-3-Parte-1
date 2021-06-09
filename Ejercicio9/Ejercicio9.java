import java.util.*;

public class Ejercicio9 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String aux;
		String palabraA;
		String palabraB;
		System.out.println("Ingrese la palabra A");
		palabraA = scanner.nextLine();
		System.out.println("Ingrese la palabra B");
		palabraB = scanner.nextLine();
		aux = palabraA;
		palabraA = palabraB;
		palabraB = aux;
		System.out.println("Se intercambiaron las palabras");
		System.out.println("La palabra A es "+palabraA);
		System.out.println("La palabra B es "+palabraB);
	}


}

