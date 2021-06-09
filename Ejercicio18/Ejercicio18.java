import java.util.*;

public class Ejercicio18 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int d1;
		int d2;
		int d3;
		int d4;
		int numero1;
		String palabra;
		int suma;
		do {
			System.out.println("Ingrese un numero no mayor de 4 digitos");
			numero1 = scanner.nextInt();
		} while (!(numero1>=0 && numero1 < 10000));
		palabra = Integer.toString(numero1);
		if (numero1<1000) {
			if (numero1<100) {
				if (numero1<10) {
					d1 = 0;
					d2 = 0;
					d3 = 0;
					d4 = numero1;
				} else {
					d1 = 0;
					d2 = 0;
					d3 = Integer.parseInt(palabra.substring(0,1));
					d4 = Integer.parseInt(palabra.substring(1,2));
				}
			} else {
				d1 = 0;
				d2 = Integer.parseInt(palabra.substring(0,1));
				d3 = Integer.parseInt(palabra.substring(1,2));
				d4 = Integer.parseInt(palabra.substring(2,3));
			}
		} else {
			d1 = Integer.parseInt(palabra.substring(0,1));
			d2 = Integer.parseInt(palabra.substring(1,2));
			d3 = Integer.parseInt(palabra.substring(2,3));
			d4 = Integer.parseInt(palabra.substring(3,4));
		}
		suma = d1+d2+d3+d4;
		System.out.println("La sumo de los digitos de "+numero1+" es "+suma);
	}

}

