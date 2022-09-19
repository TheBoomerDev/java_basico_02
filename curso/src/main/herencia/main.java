package main.herencia;

import main.herencia.acuatico.Acuatico;
import main.herencia.acuatico.Barco;
import main.herencia.acuatico.BarcoVela;
import main.herencia.aereo.Avion;
import main.herencia.interfaces.UsaVela;
import main.herencia.terrestre.Coche;
import main.herencia.terrestre.Moto;
import main.herencia.terrestre.Terrestre;

public class main {

	public static void main(String[] args) {

		// No Se Puede por ser abstract
		// Vehiculo veh = new Vehiculo();
		
		Coche car = new Coche();
		Moto moto = new Moto();
		Avion avion = new Avion();
		Barco barco = new Barco();
		BarcoVela barcoVela = new BarcoVela();
		
		// Donde Necesito un Vehiculo Terrestre
		Terrestre tCar = car;
		Terrestre tMoto = moto;
		// No hereda de Terrestre
		// Terrestre tAvion = avion;
		
		int puertas = car.numeroPuertas;
		int ruedas = car.ruedas;
		
		ruedas = moto.ruedas;
		
		// Vehiculo
		car.seMueve();
		moto.seMueve();
		
		// Terrestre
		boolean tieneR1 = car.tieneRuedas;
		boolean tieneR2 = moto.tieneRuedas;
		tieneR1 = tCar.tieneRuedas;
		tieneR2 = tMoto.tieneRuedas;
		
		Vehiculo veh = car;
		veh = moto;
		veh = avion;
		
		veh.seMueve();
		
		// Interfaces
		Acuatico acuatico = barco;
		boolean flota = acuatico.puedeFlotar;
		
		flota = barcoVela.puedeFlotar;
		boolean direccion = barcoVela.soloHaciaAdelante;
		boolean hayViento = barcoVela.hayViento();
		
		UsaVela conVela = barcoVela;
		hayViento = conVela.hayViento(); 
		
		UsaVela conVelaAnonimo = new UsaVela() {

			@Override
			public boolean hayViento() { 
				return false;
			}
		};

	}

}
