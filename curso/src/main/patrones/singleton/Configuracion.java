package main.patrones.singleton;

public class Configuracion {
	
	private Configuracion() {}
	
	private static Configuracion instance;
	public static Configuracion getInConfiguracion2stance() {
		
		if (instance == null) {
			instance = new Configuracion();
		}
		
		return instance;
		
	}

}
