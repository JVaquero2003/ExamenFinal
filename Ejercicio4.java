package examenFinal;

public class Ejercicio4 {

	public static void main(String[] args) {
		tablaMultiplicar(10, 10);
	}

	/**
	 * Pre: ---
	 * Post: Metodo que recibe dos numeros el [multiplicando] es la tabla de multiplicar 
	 * y el [num] el numero de veces que se va a realizar la multiplicación.
	 */
	public static void tablaMultiplicar(int multiplicando, int num) {
		if (num > 1) {
			tablaMultiplicar(multiplicando, num - 1);
			if (num % 2 == 0) {
				System.out.println(multiplicando + " x " + num + " = " + (multiplicando * num));
			}
		}
	}
}
