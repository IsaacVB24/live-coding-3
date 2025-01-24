package org.generation;

/*
 * 6.- Debes escribir el código en una clase llamada MangosNaranjas que tenga dos atributos: mangos, naranjas, y por lo menos un método imprimir. Debe recibir por el constructor los parametros de el número de mangos y el número de naranjas.
*/

public class MangosNaranjas {
	int mangos;
	int naranjas;
	
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	}
	
	public void imprimir() {
		System.out.println("Mangos: " + this.mangos + "\nNaranjas: " + this.naranjas);
	}
}