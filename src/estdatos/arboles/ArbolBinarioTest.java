package estdatos.arboles;

public class ArbolBinarioTest {

	public static void main(String[] args) {
		
		Nodo aMa = new Nodo("Maria");
		
		ArbolBinario ab = new ArbolBinario(aMa);
				
		Nodo aRo = new Nodo("Rodrigo");
		Nodo aEs = new Nodo("Esperanza");
		
		ab.nuevoArbol(aRo,aMa,aEs); 
		
		Nodo aAn = new Nodo("Anyora");
		Nodo aAb = new Nodo("Abel");
		
		ab.nuevoArbol(aAn,aRo,aAb);
		
		ab.imprimir(aMa, 0);
		
		// ¿Y cómo se puede imprimir?
	}

}
