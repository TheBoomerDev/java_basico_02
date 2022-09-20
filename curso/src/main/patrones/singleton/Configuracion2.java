package main.patrones.singleton;

public class Configuracion2 {
	
	private Configuracion2() {}
	
	private static Configuracion2 instance =  new Configuracion2();
	public static Configuracion2 getInstance() { 		
		return instance;
	}

}
