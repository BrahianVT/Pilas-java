//Confeccionar una clase que administre una lista tipo pila (se debe poder insertar, extraer e imprimir los datos de la pila)

public class Main{
	
	public static void main (String[] args){
		Pila pila1 = new Pila();
		pila1.insertar(1);
		pila1.insertar(2);
		pila1.insertar(3);
		pila1.imprimir();
		//System.out.println("Dato a extraer :" + pila1.extraer());
		//pila1.imprimir();
		System.out.println("El ultimo valor es: " + pila1.retornar());
		System.out.println("Cantidad de nodos + :" + pila1.cantidad_nodos());
		while(pila1.vacia() == false){
			System.out.println(pila1.extraer());
		}
	}
} 