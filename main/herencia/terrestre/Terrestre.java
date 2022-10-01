package main.herencia.terrestre;

import main.herencia.Vehiculo;

public abstract class Terrestre extends Vehiculo {
	
	public final boolean tieneRuedas = true;
	
	protected void arrancar() {
		this.seMueve();
		System.out.println("Arrancamos Motores");
	}
	

}
