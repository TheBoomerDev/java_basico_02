package main.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaFind {

	public static void main(String[] args) {

		List<String> letters = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i < 100000; i++) {
			
			Optional<String> res = letters.stream()
					.filter((letter)->{

						int idx = letters.indexOf(letter);
						if (idx <= 0) return false;
						
						return (idx % 2 == 0);
					})
					.findAny();
			
			String dato = res.get(); 
			
		} 
		
		
		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("millis: "+ elapsedTime/1000000);
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			
			String resS = "";
			for (String letter : letters) {
				int idx = letters.indexOf(letter);
				if (idx <= 0) continue;
				
				if (idx % 2 == 0) {
					resS = letter;
					break;
				}
			}
			
		}
		elapsedTime = System.nanoTime() - startTime;
		System.out.println("millis: "+ elapsedTime/1000000);
		
		

	}

}
