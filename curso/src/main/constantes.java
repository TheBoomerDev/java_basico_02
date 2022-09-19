package main;

public class constantes {
	
	private final static int  constante01 = 12;
	
	private final static int constante02 = getValorConstance();
	
	private final int constante03;
	
	public constantes() {
		// Una vez tiene valor no se puede modificar.
		constante03 = 1;
	}
	
	private static int getValorConstance () {
		 
		int contador = 0;
		
			
		for (int i = 1; i <= 1500; i++) {
				
			contador = contador * i;
			
		}
		
		return contador;
	}
	

	public static void main(String[] args) {

		//  No se peude modificar
		// constante01++; 

	}

}
