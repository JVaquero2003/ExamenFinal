package examenFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		cogerDatos("C:\\Users\\jovap\\Desktop\\Examen Final\\HablanosDelDon.txt");
	}

	/**
	 * Pre: --- 
	 * Post: Metodo que lee el fichero [ruta] y que nos muestra el total de
	 * divorcios con separación del 2019 y el total de divorcios sin separacion del
	 * 2018.
	 */
	private static void cogerDatos(String ruta) {
		File file = new File(ruta);
		try {
			Scanner f = new Scanner(file);
			f.nextLine();
			while (f.hasNextLine()) {
				String next = f.nextLine();
				String[] palabra = next.split(".");
				for (int i = 0; i < palabra.length; i++) {
					System.out.println(palabra[i]);
				}
				/*
				 * Se libera el fichero que estamos leyendo.
				 */
				f.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + ruta + " no ha podido ser abierto.");
		}
	}
}
