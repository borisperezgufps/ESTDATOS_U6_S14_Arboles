package estdatos.arboles;

public class ArbolBinario {

	public Nodo raiz;

	public ArbolBinario() {
		raiz = null;
	}

	public ArbolBinario(Nodo raiz) {
		this.raiz = raiz;
	}

	public Nodo getRaizArbol() {
		return raiz;
	}

	// Comprueba el estatus del árbol
	boolean esVacio() {
		return raiz == null;
	}

	public void nuevoArbol(Nodo ramaIzqda, 
			Nodo nodoPadre, 
			Nodo ramaDrcha) {
		
		if(raiz==null)
			raiz = nodoPadre;
		
		nodoPadre.setRamaIzdo(ramaIzqda);
		nodoPadre.setRamaDcho(ramaDrcha);
	}
	
	public void imprimir(Nodo padre, 
			int cont) {
		if(padre!=null) {
			System.out.println(padre.getValorNodo() 
					+ " - Nivel: "+cont);
			
//			imprimir(padre.getSubarbolIzdo());
//			imprimir(padre.getSubarbolDcho());
		}
	}

}


















