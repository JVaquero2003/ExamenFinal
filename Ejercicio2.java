package examenFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		cogerDatos("C:\\Users\\jovap\\Desktop\\Examen Final\\Divorcios.csv");
	}

	private static void cogerDatos(String ruta) {
		File file = new File(ruta);
		try {
			/*
			 * Se crea un objeto [Formatter] al que se asocia un fichero deno- minado
			 * [file].
			 */
			Scanner f = new Scanner(file);
			f.nextLine();
			int contador = 0;
			int contadorDos = 0;
			int sum = 0;
			int sum2 = 0;
			int sum3 = 0;
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
					}else {
						if(palabra[0] != palabra[0]) {
							sum = 0;
							sum2 = 0;
						}else {
							sum = Integer.parseInt(palabra[3]);
							sum2 = sum + sum;
							sum3 = sum2;
							if(sum3 > sum2) {
								System.out.println("El numero mas alto es --> " + sum3);
							}
						}
					}
				}
			}
			System.out.println(
					"El número total de divorcios CON separación previa en el año 2019 es de --> " + contador);
			System.out.println(
					"El número total de divorcios SIN separación previa en el año 2019 es de --> " + contadorDos);
			/*
			 * Se libera el fichero que estamos leyendo.
			 */
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + ruta + " no ha podido ser abierto.");
		}
	}
}
