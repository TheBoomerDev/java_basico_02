package main.fechas;

import java.util.Date;

public class UsoDate {

	public static void main(String[] args) {

		Date fechaAntes = new Date();
		
		Date fechaDespues = new Date(); 
		
		if (fechaAntes.after(fechaDespues)) {
			// Entra si es 1 es posterior a 2
		}
		 
		
		int year = fechaAntes.getYear();
		int DiaSemana = fechaAntes.getDay();
		int diaMes = fechaAntes.getDate();
		int hour = fechaAntes.getHours();
		int minute = fechaAntes.getMinutes();
		int seconds = fechaAntes.getSeconds();
		
		
		fechaDespues = new Date(); 
		
		fechaDespues.setYear(year);
		fechaDespues.setDate(diaMes);
		fechaDespues.setHours(hour);
		fechaDespues.setMinutes(minute);
		fechaDespues.setSeconds(seconds); 
		
		// Comparar Fechas
		boolean esDespues = fechaAntes.after(fechaDespues);
		boolean esAntes = fechaAntes.before(fechaDespues);
		
		// Siempre serán diferentes. Salvo que lleguen a tener el mismo millisegundo
		boolean esIgual = fechaAntes.equals(fechaDespues); // No se debe usar
		
		
		System.out.println("VAYA CHORRADA");
	}

}
