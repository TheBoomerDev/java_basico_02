package main.patrones.observer;

import main.herencia.terrestre.Coche;

public interface Observando {
	
	void updated(Coche coche, int numeroCoches);

}
