package main.matrices.maps;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import main.herencia.terrestre.Coche;
import main.patrones.mvc.Tools;

public class Cita {

	private Date fecha = new Date();
	private int id = 0;
	private String name = "";

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String format = "%s - %d => %s";
		String formatoFecha = "%s/%s/%s";
		String formatoHumano = "dd/MM/YYYY";
		
		// OLD WAY - DEPRECATED
		int year = this.fecha.getYear();
		int month = this.fecha.getMonth();
		int day = this.fecha.getDate();
		String fechaStr = String.format(formatoFecha, day, month, year);
		
		// 01/01/2001
		// 01/01/2001
		
		// 1.- DD/MM/YYYY -> MM/DD/YYYY
		// 2.- TimeZone -> Z/T
		
		// BETTER
		SimpleDateFormat spf = new SimpleDateFormat(formatoHumano);
		fechaStr = spf.format(fecha);
		
		return String.format(format, fechaStr, this.id, this.name);
	}

	public static Cita getRandom(int rndId) {

		Tools tools = Tools.getInstance();

		Cita item = new Cita();

		item.id = tools.getRandomInt(10);
		item.name = "CITA-" + tools.getRandomInt(1000);

		item.fecha = new Date(ThreadLocalRandom.current().nextInt() * 1000L);

		return item;

	}

}
