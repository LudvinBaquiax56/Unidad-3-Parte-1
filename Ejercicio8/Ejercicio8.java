import java.util.*;

public class Ejercicio8 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		double promedio;
		System.out.println("Ingrese el primer numero");
		numero1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2 = scanner.nextInt();
		System.out.println("Ingrese el tercer numero");
		numero3 = scanner.nextInt();
		promedio = (numero1+numero2+numero3)/3;
		System.out.println("El promedio de " + numero1 + " , " + numero2 + " y " + numero3 + " es " + promedio);
	}

}

