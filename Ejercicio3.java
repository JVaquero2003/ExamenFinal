package examenFinal;

public class Ejercicio3 {

	public static void main(String[] args) {
		ListaSimpleEnlazada l = new ListaSimpleEnlazada();
		Node n1 = new Node(20, null);
		l.add(n1);
		Node n2 = new Node(40, null);
		l.add(n2);
		Node n3 = new Node(50, null);
		l.add(n3);
		l.eliminarMayor();
		l.show();
	}
}
