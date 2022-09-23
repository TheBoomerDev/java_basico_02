package main.hilosSegundoPlano;

public class Main {
	
	private static void sleep() {
		int segundo = 1000;
		 try{  
             Thread.sleep(segundo);  
         }catch(InterruptedException e){
        	 System.out.println(e);
         }  
	}

	public static void main(String[] args) {

		Respuesta callback = new Respuesta() {
			
			@Override
			public void heTerminado(String termine) {
				System.out.println("Terminó: "+termine);
			}
			
			@Override
			public void error(String mensaje) { 
				
			}
			
			@Override
			public int contador(int currentAmount) {
				System.out.println("Vamos por:"+currentAmount);
				return 0;
			}
		};
		
		// ===============================================================
		
		ViajeTemporal viaje01 = new ViajeTemporal("01", 3, callback);
		ViajeTemporal viaje02 = new ViajeTemporal("02", 5, callback);
		ViajeTemporal viaje03 = new ViajeTemporal("03", 1, callback);
		
		viaje01.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hilo Principal -> 1");
			sleep();
		}
		
		viaje02.start();
		viaje03.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hilo Principal -> 2");
			sleep();
		}
		

	}

}
