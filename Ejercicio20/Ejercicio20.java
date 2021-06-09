import java.util.*;

public class Ejercicio20 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int d1;
		int d2;
		int d4;
		int d5;
		int num;
		String aux;
		do {
			System.out.println("Ingrese un numero de 5 digitos");
			num = scanner.nextInt();
		} while (!(num>9999 && num<100000));
		aux = Double.toString(num);
		d1 = Integer.parseInt(aux.substring(0,1));
		d2 = Integer.parseInt(aux.substring(1,2));
		d4 = Integer.parseInt(aux.substring(3,4));
		d5 = Integer.parseInt(aux.substring(4,5));
		if ((d1 == d5 && d2 == d4 )) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
	}

}

