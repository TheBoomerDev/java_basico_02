package main.herencia.terrestre;
 
import java.lang.reflect.Field;
import java.util.HashMap;

import main.patrones.mvc.ProductosModel;
import main.patrones.mvc.Tools;

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
	
	
	public Moto toMoto() {
		Moto moto = new Moto();
		moto.ruedas = this.ruedas;
				
		return moto;
	} 
	
	@Override
	protected void arrancar() { 
		System.out.println("Giramos la llave del Coche");
	}
	
	
	public static Coche getRandom (int rndId) { 
		
		Tools tools = Tools.getInstance();

		int ruedas = tools.getRandomInt(10);
		int numeroPuertas = Math.abs(tools.getRandomInt(rndId) / 1000);
		Coche item = new Coche(ruedas, numeroPuertas); 
		
		return item;
		
	}
	
	
	@Override
	public String toString() {
		String format = "C:%s - %s";
		return String.format(format, this.ruedas, this.numeroPuertas);
	}
	
	
	public HashMap<String, Object> toMap() throws IllegalArgumentException, IllegalAccessException{
		HashMap<String, Object> map = new HashMap<String, Object>();
		for (Field field : Coche.class.getDeclaredFields()) {
		    // Skip this if you intend to access to public fields only
		    if (!field.isAccessible()) {
		        field.setAccessible(true);
		    }
		    map.put(field.getName(), field.get(this));
		}
		return map;
	}
}
