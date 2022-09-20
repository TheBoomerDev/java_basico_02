package main.patrones.mvc;

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

}
