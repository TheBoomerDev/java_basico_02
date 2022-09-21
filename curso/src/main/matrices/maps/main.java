package main.matrices.maps;

import java.util.List;

import main.patrones.mvc.Tools;

public class main {
	
	public static void main(String[] args) {
		
		Tools tools = Tools.getInstance();
			
		Agenda agenda = new Agenda();
		MESES[] meses = MESES.values();
		DIAS_SEMANA[] dias = DIAS_SEMANA.values();
		
		// Generamos Citas aleatorias para todo el año
		for (int i = 0; i < 150; i++) {
			
			Cita cita = Cita.getRandom(i); 
			
			int posMes = (int) (tools.getRandomInt( meses.length) );
			MESES mesRandom = meses[posMes];		 
			
			int posDia = (int) (tools.getRandomInt( dias.length) );
			DIAS_SEMANA diaRandom = dias[posDia]; 
			
			agenda.setCita(mesRandom, diaRandom, cita);
			
		}  
		
		
		// Enseño Mi Agenda del Año
		for (MESES mes : meses) {
			
			for (DIAS_SEMANA dia : dias) {
				
				List<Cita> misCitas = agenda.getDia(mes, dia);
				if (misCitas == null || misCitas.size() <= 0) continue;
				
				String format = "%s -> %s";
				String msg = String.format(format, mes, dia);
				System.out.println(msg);
				
				for (Cita cita : misCitas) {
					System.out.println(cita);
				}
				
			}
			
		} 
		
		
		System.out.println("Agenda Termino");
		
	}

}
