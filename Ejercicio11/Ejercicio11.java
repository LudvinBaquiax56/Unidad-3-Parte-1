import java.util.*;

public class Ejercicio11 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int centimetros;
		double metro;
		double pie;
		double pulgada;
		double yarda;
		System.out.println("Ingrese un valor de medida en centimetros");
		centimetros = scanner.nextInt();
		yarda = centimetros / 91.44;
		metro = centimetros / 100;
		pie = centimetros / 30.48;
		pulgada = centimetros / 2.54;
		System.out.println("El valor de " + centimetros + " cm, en:");
		System.out.println("Yardas es " + yarda);
		System.out.println("Metros es " + metro);
		System.out.println("Pies es " + pie);
		System.out.println("Pulgadas es " + pulgada);
	}

}

