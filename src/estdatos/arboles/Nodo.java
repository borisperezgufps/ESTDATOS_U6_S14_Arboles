package estdatos.arboles;

public class Nodo {

	private Object dato;
	private Nodo izdo;
	private Nodo dcho;

	public Nodo(Object valor) {
		dato = valor;
		izdo = dcho = null;
	}

	public Nodo(Nodo ramaIzdo, Object valor, 
			Nodo ramaDcho) {
		this(valor);
		izdo = ramaIzdo;
		dcho = ramaDcho;
	}

	// operaciones de acceso
	public Object getValorNodo() {
		return dato;
	}

	public Nodo getSubarbolIzdo() {
		return izdo;
	}

	public Nodo getSubarbolDcho() {
		return dcho;
	}

	public void setValor(Object d) {
		dato = d;
	}

	public void setRamaIzdo(Nodo n) {
		izdo = n;
	}

	public void setRamaDcho(Nodo n) {
		dcho = n;
	}

}
