package main.patrones.observer;

import main.herencia.terrestre.Coche;

public class main {

	public static void main(String[] args) {

		ConcesionarioCoches concesionario = ConcesionarioCoches.getInstance();
		
		Observando obs01 = new Observando() {

			@Override
			public void updated(Coche coche, int numeroCoches) {
				System.out.println("OBS01: "+numeroCoches+" - "+coche);
			}
			
		};
		concesionario.addObservable(obs01);
		
		Observando obs02 = new Observando() {

			@Override
			public void updated(Coche coche, int numeroCoches) {
				System.out.println("OBS02: "+numeroCoches+" - "+coche);
			}
			
		};
		concesionario.addObservable(obs02);
		
		Observando obs03 = new Observando() {

			@Override
			public void updated(Coche coche, int numeroCoches) {
				System.out.println("OBS03: "+numeroCoches+" - "+coche);
			}
			
		};
		concesionario.addObservable(obs03);
		
		for (int i = 0; i < 10; i++) {
			Coche item = Coche.getRandom(i);
			concesionario.addCoche(item);
		}
		
		concesionario.removObservable(obs02);
		
		for (int i = 0; i < 10; i++) {
			Coche item = Coche.getRandom(i);
			concesionario.addCoche(item);
		}
		
		
	}

}
