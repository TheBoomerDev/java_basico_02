package main.cosas;

public class MejorasDeCodigo2 {
	
	 

	public static void main(String[] args) {
		
		int n = 0;
		Integer nI = 0;
		
		// No puedo igualarlo a null
		// n = null;
		
		nI = null; 
		// n = nI; // Rompe el código aqui.
		
		// ===================
		
		Boolean test = null;
		// boolean testBasic = test; // Rompe el código aqui.
		
		// ===================
		
		int contador = 12;
		String valor = Integer.valueOf(contador).toString().trim();
		
		Integer v01 = contador;
		String valor01 = v01.toString();
		
		String valor02 = ""+contador;
		String valor03 = String.valueOf(contador);
		
		
		// ===================
		
		long startTime = System.nanoTime();
		
		String cell = "30";
		for (int i = 0; i < 10000; i++) {
			
			new String(new Integer(new Double(cell).intValue()).toString());
			
		}
		
		
		long elapsedTime = System.nanoTime() - startTime;
		 System.out.println("millis: "+ elapsedTime/1000000);
		
		 startTime = System.nanoTime();
		// Que está pasando?		
		Double d = new Double(cell);
		int dInt = d.intValue();
		Integer intg = new Integer(dInt); 
		String str00 = intg.toString();
		String str = new String(str00);
		
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("millis: "+ elapsedTime/1000000);
		
		startTime = System.nanoTime();
		
		// Mas facil ? 
		for (int i = 0; i < 10000; i++) {
			String res = cell.toString();
		}
		
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("millis: "+ elapsedTime/1000000);
		
		
		
	}

}
