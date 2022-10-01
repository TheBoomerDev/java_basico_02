package main.fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UsoCalendar {

	public static void main(String[] args) {
		 Calendar cal = Calendar.getInstance();
		 
		 Date date = cal.getTime();
		 cal.setTime(date);
		 
		 cal.set(Calendar.APRIL, 1);
		 cal.set(Calendar.DAY_OF_YEAR, 256);
		 System.out.println("Feliz Dia del Programador: "+cal.toString()); 
		 System.out.println("Feliz Dia del Programador: "+cal.getTime());
		 
		 int year = cal.get(Calendar.YEAR);
		 int month = 1 + cal.get(Calendar.MONTH);
		 int day = cal.get(Calendar.DAY_OF_MONTH);
		 
		 String format = "%d/%d/%d";
		 String msg = String.format(format, day, month, year);
		 System.out.println("Feliz Dia del Programador: "+msg);
		 
		 SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
		 System.out.println("Feliz Dia del Programador: "+spf.format(cal.getTime()));
		 
		 
		 cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) - 2);
		 // cal.minusHour(2)
	}

}
