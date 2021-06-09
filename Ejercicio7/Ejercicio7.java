import java.io.*;
import java.math.*;

public class Ejercicio7 {

	public static void main(String args[]) {
		double numero1;
		double numerodisminuido;
		numero1 = Math.floor(Math.random()*40)+10;
		System.out.println("El numero aleatorio es "+numero1);
		numerodisminuido = 0.85*numero1;
		System.out.println("El numero "+numero1+" disminuido en un 15% es "+numerodisminuido);
	}


}

