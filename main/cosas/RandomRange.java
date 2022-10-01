package main.cosas;

import java.util.Random;

public class RandomRange {

	public static void main(String[] args) {
		
		/*
			Usamos el MaxValue para tener como referencia de busqueda el numero más alto del SO.
			Por lo que cualquer dato que nos venga, sieSIEMPRE será más bajo y evitamos el HARCODED.	
		 //*/
		
		Random seed = new Random();
		
		Integer masPeque = Integer.MAX_VALUE;
		
		int min = 1;
		int max = 1000000;
		int numeroVeces = (int) (seed.nextInt() *max+min);
		
		for (int i = 0; i < numeroVeces; i++) {
			
			int rndNum = (int) (seed.nextInt() *max+min);
			if (rndNum <= masPeque) {
				masPeque = rndNum;
			} 
		}
		
		System.out.println("El más Pequeo Del Mundo:"+masPeque);

	}

}
