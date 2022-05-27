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

	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

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
	
	public boolean eliminarMayor() {
		try {
			if (size == 0) {
				System.out.println("La lista esta vacia!!");
				return false;
			} else {
				
			}
			size--;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}

	public void show() {
		Node p = first;
		for (int i = 0; i < size; i++) {
			System.out.println("[ " + i + "] -> " + p.getContent());
			p = p.getNext();
		}
	}

	@Override
	public String toString() {
		return "First=" + first + ", Size=" + size;
	}
}
