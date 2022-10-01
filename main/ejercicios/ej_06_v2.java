package main.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ej_06_v2 {
	
	/*
	
	Ejercicio 06:
    Hacer una lista de los primeros 150 números (0-150) y sumar en una variable los impares, 
    y en otra los pares. Pasar por pantalla el resultado de ambas

	 //*/

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();
		for (int i = 1; i <= 150; i++) {
			numeros.add(i);
		}
		
		Stream<Integer> impares = numeros.stream().filter((num)->{
			return (num % 2 != 0);
		});
		
		Stream<Integer> pares = numeros.stream().filter((num)->{
			return (num % 2 == 0);
		});
		
		System.out.println("Impares:"+impares.toArray());
		System.out.println("Pares:"+pares);

	}

}
