package main.herencia.terrestre;

public class Moto extends Terrestre {

	public int ruedas = 2;
	
	@Override
	public boolean moverMe() {
		this.arrancar();	
		System.out.println("Manillar y Palanca. A Rodar");
		
		return true;
	} 
	
}
