package main.patrones.mvc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Tools {
	
	private Tools() {}
	
	private static Random seed = new Random();
	private static Tools instance =  new Tools();
	public static Tools getInstance() { 		
		return instance;
	}
	
	public int getRandomInt(int max) {
		int min = 1; 
		return (int) (seed.nextInt() *max+min);
	
	}
	
	public String getRandomName(String name) {
		int rndNum = this.getRandomInt(1000);
		
		String format = "%s %d";
		return String.format(format, name, rndNum);
	}

	public <T> List<T> sortedList(List<T> lista){
  
		Comparator<T> compa = (Comparator<T>) lista.get(0); 
		Collections.sort(lista, compa);
		return lista;
	}
	
}
