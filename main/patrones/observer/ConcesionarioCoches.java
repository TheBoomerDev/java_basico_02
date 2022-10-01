package main.patrones.observer;

import java.util.ArrayList;

import main.herencia.terrestre.Coche; 

public class ConcesionarioCoches {
	
	private ArrayList<Coche> coches = new ArrayList<Coche>();
	
	private ArrayList<Observando> escuchando = new ArrayList<Observando>();
	
	
	private ConcesionarioCoches() {}
	private static ConcesionarioCoches instance =  new ConcesionarioCoches();
	public static ConcesionarioCoches getInstance() { 		
		return instance;
	}
	
	public void addCoche(Coche coche) {
		this.coches.add(coche);
		this.notifyObservable();
	}
	
	
	public void addObservable(Observando listener) {
		this.escuchando.add(listener);
	}
	
	public void removObservable(Observando listener) {
		this.escuchando.remove(listener);
	}
	
	public void notifyObservable () {
		
		Coche ultimo = this.coches.get(this.coches.size() - 1);
		
		for (Observando observando : escuchando) {
			observando.updated(ultimo, this.coches.size());
		}
		
	}

}
