package main.ejercicios;

public class ej_06 {
	
	/*
	
	Ejercicio 06:
    Hacer una lista de los primeros 150 números (0-150) y sumar en una variable los impares, 
    y en otra los pares. Pasar por pantalla el resultado de ambas

	 //*/

	public static void main(String[] args) {

		int impares = 0;
		int pares = 0;
		for (int i = 1; i <= 150; i++) {
			
			if (i % 2 == 0) {
				pares = pares + i;
			}else {
				impares = impares + i;
			}
			
		}
		System.out.println("Impares:"+impares);
		System.out.println("Pares:"+pares);

	}

}
