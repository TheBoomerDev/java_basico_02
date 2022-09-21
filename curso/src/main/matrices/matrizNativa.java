package main.matrices;

import main.patrones.mvc.Tools;

public class matrizNativa {
	
	public static void main(String[] args) {
	
		Tools tools = Tools.getInstance();
		
		// Nativa
		int[][] enteros = { 
				{0,0,0,0,0}, 
				{0,0,0,0,0}, 
				{0,0,0,0,0}, 
				{0,0,0,0,0}, 
				{0,0,0,0,0}
				};
		
		
		// Rellenamos de información
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				int numero = tools.getRandomInt(100);
				enteros[j][i] = numero;
			}
		}
		
		
		// Mostramos la matriz
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				System.out.println("C:"+i+" - F:"+j+" -> "+enteros[j][i]); 
			}
		}
		
	} 

}
