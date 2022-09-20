package main.patrones;

import main.herencia.terrestre.Coche;
import main.herencia.terrestre.Moto;

public class main {

	public static void main(String[] args) {

		// Ejemplo de patr�n adaptador
		Integer entero = 1;
		String cadena = entero.toString(); 
		
		//  M�s ejemplos de Patrones Adaptador
		Integer entero2 = 1; // int
		Long largo = 1l; // long
		Double doble = 4.5d; // double
		Short corto = 2; // short
		
		Boolean verdadero = false; // boolean
		Float flotante = 1.5f; // float 
 
		
		flotante = entero2.floatValue();
		doble = entero2.doubleValue();
		int dd = entero2.intValue();
		largo = entero2.longValue();
		cadena = entero2.toString();
		
		
		entero2 = Integer.valueOf(cadena);		
		
		// Adaptardor -> Transformer
		Coche optimus = new Coche(4,2);
		Moto bumblebee = optimus.toMoto();
		

	}

}
