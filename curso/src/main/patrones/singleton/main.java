package main.patrones.singleton;

public class main {

	public static void main(String[] args) {

		Configuracion2 cfg01 = Configuracion2.getInstance();
		Configuracion2 cfg02 = Configuracion2.getInstance();
		
		System.out.println(cfg01);
		System.out.println(cfg02);

	}

}
