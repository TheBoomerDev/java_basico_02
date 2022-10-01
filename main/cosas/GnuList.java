package main.cosas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GnuList {

	public static void main(String[] args) {
		
		List<String> letters = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
		
		 
		String res = letters.stream().reduce("", (elementoPrev, current)->{
			return elementoPrev+"-"+current.toUpperCase();
		});
		
		System.out.println(res);
		
		
		// ======= Sacar una media
		
		Integer resI = letters.stream().map((letter)->{
			return letters.indexOf(letter);
		}).reduce(1, (prev, current)->{
			return (int)((prev + current));
		});
		
		int size = letters.size();
		String format = "REs: %d - Size: %d -> DIV: %s";
		String msg = String.format(format, resI, size, (resI / size));
		System.out.println(msg);
		 
		
	}
	
}
