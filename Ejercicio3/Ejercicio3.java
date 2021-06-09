import java.util.*;

public class Ejercicio3 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int doble;
		int numero1;
		int triple;
		System.out.println("Ingrese el numero a duplicar y triplicar");
		numero1 = scanner.nextInt();
		doble = numero1*2;
		triple = numero1*3;
		System.out.println("El doble del "+numero1+" es "+doble);
		System.out.println("El triple del "+numero1+" es "+triple);
	}


}

