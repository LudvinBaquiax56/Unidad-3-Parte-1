import java.util.*;

public class Ejercicio14 {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int numero1;
		int numero2;
		System.out.println("Ingrese el primer numero");
		numero1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2 = scanner.nextInt();
		if ((numero2%numero1)==0) {
			System.out.println("Es divisible");
		} else {
			System.out.println("No es divisible");
		}
	}

}

