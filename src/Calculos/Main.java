package Calculos;

public class Main {
	
	public static void main(String[] args) {
		Nodo p1 = new Nodo(10,10,4);
		Nodo p2 = new Nodo(10,10,3);
		
		Tramo t1 = new Tramo();
		
		//Asigno los nodos p1 y p2 a los nodos de la clase Tramo.java
		t1.setN1(p1);
		t1.setN2(p2);
		
		System.out.println(p1.getCota());
		System.out.println(p2.getCota());
		
		//System.out.println(t1.calcularPendTerreno(p1, p2));
		t1.calcularPendTerreno(p1, p2);
		System.out.println(t1.getPendTerreno());
	
	}
		
}
