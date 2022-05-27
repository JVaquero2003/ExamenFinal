package examenFinal;

public class ListaSimpleEnlazada {

	private Node first;
	private int size;

	public ListaSimpleEnlazada() {

	}

	public ListaSimpleEnlazada(Node first, int size) {
		super();
		this.first = first;
		this.size = size;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Pre: ---
	 * Post: Metodo que añade un [node] en la lista simplemente enlazada.
	 */
	public boolean add(Node node) {
		try {
			if (size == 0) {
				first = node;
			} else {
				Node p = first;
				for (int i = 1; i < size; i++) {
					p = p.getNext();
				}
				p.setNext(node);
			}
			size++;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	/**
	 * Pre: --- 
	 * Post: inserta [node] en la posición [position] de la lista
	 * simplemente enlazada.
	 */
	public boolean add(int position, Node node) {
		try {
			if (position == 0) {
				node.setNext(first);
				first = node;
			} else if (position == size) {
				return add(node);
			} else {
				Node p = first;
				for (int i = 1; i < position; i++) {
					p = p.getNext();
				}
				node.setNext(p.getNext());
				p.setNext(node);
			}
			size++;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	/**
	 * Pre: --- 
	 * Post: devuelve el nodo situado en la posicion [position] de la lista
	 * simplemente enlazada.
	 */
	public Node get(int position) {
		try {
			if (position >= 0 && position < size) {
				Node p = first;
				for (int i = 1; i <= position; i++) {
					p = p.getNext();
				}
				return p;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}

	/**
	 * Pre: ---
	 * Post: Devuelte true sí y solo sí la lista simplemente enlazada está
	 * vacía. Devuelve false en caso contrario.
	 */
	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	/**
	 * Pre: ---
	 * Post: Metodo que elimina el objeto de la posicion que el usuario elija.
	 */
	public boolean delete(int position) {
		try {
			if (size == 0) {
				System.out.println("La lista esta vacia!!");
				return false;
			} else if (position == 0) {
				first = first.getNext();
			} else if (position == size - 1) {
				Node p = first;
				for (int i = 1; i < size; i++) {
					p = p.getNext();
				}
				p.setNext(null);
			} else {
				Node p = first;
				for (int i = 0; i < position - 1; i++) {
					p = p.getNext();
				}
				p.setNext(p.getNext().getNext());
			}
			size--;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	/**
	 * Pre: ---
	 * Post: Metodo que elimina el numero mas alto de la lista simplemente enlazada
	 */
	public boolean eliminarMayor() {
		if (size == 0) {
			System.out.println("La lista esta vacia!!");
			return false;
		} else {
			Node p = first;
			int numMayor = 0;
			for (int i = 0; i < size; i++) {
				if (p.getContent() > first.getContent()) {
					numMayor++;
				}
				p = p.getNext();
			}
			delete(numMayor);
		}
		return true;
	}

	/**
	 * Pre: --- 
	 * Post: muestra por pantalla la posición de todos los nodos de la
	 * lista simplemente enlazada, junto a su contenido. Si está vacía, indica con un
	 * mensaje que la cola no tiene contenido.
	 */
	public void show() {
		if (!isEmpty()) {
			Node p = first;
			for (int i = 0; i < size; i++) {
				System.out.println("[" + i + "] -> " + p.toString());
				p = p.getNext();
			}
		} else {
			System.out.println("¡Is empty!");
		}
	}

	@Override
	public String toString() {
		return "First=" + first + ", Size=" + size;
	}
}
