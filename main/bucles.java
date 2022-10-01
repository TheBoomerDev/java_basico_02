package main;

public class bucles {

	public static void main(String[] args) {
		
		// While
		boolean mantenteDentro = true;
		int contador = 0;
		while(mantenteDentro) {
			
			if (contador >= 100) {
				mantenteDentro = false;
				continue;
			}

			// contador = contador + 1;
			contador++;
			System.out.println(contador);
		} 
		
		// DO-While
		mantenteDentro = true;
		contador = 0;
		
		do {
			
			if (contador >= 100) {
				mantenteDentro = false;
				continue;
			}

			// contador = contador + 1;
			contador++;
			System.out.println(contador);
			
		}while(mantenteDentro);
		
		//  FOR
		mantenteDentro = true;
		contador = 0;
		
		for (int i = 0; i < 100; i++) {
			
			if (contador >= 100) {
				mantenteDentro = false;
				continue;
			}

			// contador = contador + 1;
			contador++;
			System.out.println(contador);
		}

	}

}
