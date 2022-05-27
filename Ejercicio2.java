package examenFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		cogerDatos("C:\\Users\\jovap\\Desktop\\Examen Final\\Divorcios.csv");
	}

	/**
	 * Pre: ---
	 * Post: Metodo que lee el fichero [ruta] y que nos muestra el total de divorcios con separación
	 * del 2019 y el total de divorcios sin separacion del 2018.
	 */
	private static void cogerDatos(String ruta) {
		File file = new File(ruta);
		try {
			Scanner f = new Scanner(file);
			f.nextLine();
			int contador = 0;
			int contadorDos = 0;
			while (f.hasNextLine()) {
				String next = f.nextLine();
				String[] palabra = next.split(";");
				for (int i = 0; i < palabra.length; i++) {
					palabra[i] = palabra[i].replace(" ", " ");
				}
				for (int i = 0; i < palabra.length; i++) {
					if (palabra[1].equals("Si") && palabra[2].equals("2019")) {
						contador++;
					} else if (palabra[1].equals("No") && palabra[2].equals("2018")) {
						contadorDos++;
					}
				}
			}
			System.out
					.println("El número total de divorcios CON separación previa en el año 2019 es de --> " + contador);
			System.out.println(
					"El número total de divorcios SIN separación previa en el año 2018 es de --> " + contadorDos);
			/*
			 * Se libera el fichero que estamos leyendo.
			 */
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + ruta + " no ha podido ser abierto.");
		}
	}
}
