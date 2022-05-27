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
			while (f.hasNextLine()) {
				String next = f.nextLine();
				String[] palabra = next.split(";");
				for (int i = 0; i < palabra.length; i++) {
					palabra[i] = palabra[i].replace(" ", " ");
				}
				for(int i = 0; i < palabra.length; i++) {
					if(palabra[1].equals("SI")) {
						
					}
				}
			}
			/*
			 * Se libera el fichero que estamos leyendo.
			 */
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + ruta + " no ha podido ser abierto.");
		}
	}
}
