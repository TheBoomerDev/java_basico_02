package main.matrices.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agenda {
	
	private Map<MESES, Map<DIAS_SEMANA, ArrayList<Cita>> > agenda = new HashMap<MESES, Map<DIAS_SEMANA, ArrayList<Cita>>>();
	

	public Map<DIAS_SEMANA, ArrayList<Cita>> getMes( MESES mes){
		return this.agenda.get(mes);
	}
	
	public List<Cita> getDia(MESES mes, DIAS_SEMANA dia){
		Map<DIAS_SEMANA, ArrayList<Cita>> citasMes = this.getMes(mes);
		if (citasMes == null) {
			ArrayList<Cita> listaVacia = new ArrayList<Cita>();
			citasMes = new HashMap<DIAS_SEMANA, ArrayList<Cita>>();
			citasMes.put(dia, listaVacia);
		}
		return citasMes.get(dia);
		
	}
	
	private void setCitasDia(MESES mes, DIAS_SEMANA dia, List<Cita> citas) {
		this.agenda.get(mes).put(dia, (ArrayList<Cita>) citas); 
	}
	
	public void setCita(MESES mes, DIAS_SEMANA dia, Cita cita) {
		
		List<Cita> citas = this.getDia(mes, dia);
		if (citas == null) {
			citas = new ArrayList<Cita>();
		}
		citas.add(cita); 
		
		Map<DIAS_SEMANA, ArrayList<Cita>> mapMes = this.getMes(mes);
		if (mapMes == null) {
			mapMes = new HashMap<DIAS_SEMANA, ArrayList<Cita>>();
		}
		mapMes.put(dia, (ArrayList<Cita>) citas);
		
		this.agenda.put(mes, mapMes);
	}
	
}
