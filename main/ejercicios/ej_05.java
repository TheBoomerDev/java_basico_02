package main.ejercicios;
 

public class ej_05 {
	
	/*
	Ejercicio 05:
    Realizar un c�digo qu� poniendo una variable int diga a qu� d�a de la semana corresponde; 
    usando el enumerado del ejercicio anterior.
	//*/

	public static void main(String[] args) {
		
		int diaSemana = 4;
		
		DIAS_SEMANA[] lista = DIAS_SEMANA.values();
		
		DIAS_SEMANA diaEnum = lista[diaSemana];
		System.out.println(diaEnum);
		
		if (DIAS_SEMANA.LUNES.getValue() > DIAS_SEMANA.JUEVES.getValue()) {
			// Comparar y utilizarlos con Valor
		}
		
	}
}
