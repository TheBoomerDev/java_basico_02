package main.herencia.terrestre;

public class Coche extends Terrestre {
	
	private int numeroPuertas = 4;
	private int ruedas = 4;
	
	public int getNumeroPuertas() {
		return numeroPuertas;
	}
	protected void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	public int getRuedas() {
		return ruedas;
	}
	protected void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public Coche(int ruedas, int puertas) {
		this.numeroPuertas = puertas;
		this.ruedas = ruedas;
	}
	
	
	@Override
	public boolean moverMe() {
		
		this.arrancar();		
		System.out.println("Giro el Volante y a rodar");
		
		return true;
	} 
}
