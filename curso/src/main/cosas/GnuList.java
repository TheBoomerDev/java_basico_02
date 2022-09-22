package main.cosas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GnuList {

	public static void main(String[] args) {
		
		String[] alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z".split(" ");
		
		List<String> alf = new ArrayList<String>();
		for (String letter : alphabet) {
			alf.add(letter);
		}
		
		 Stream<Object> names = alf.stream().map((letter)->{
			 String format = "%sNU %s Not Unix";
			 letter = letter.toUpperCase();
			 String msg = String.format(format, letter, letter);
			return msg;
		});
		 
		 for (Object name : names.toArray()) {
			System.out.println(name);
		}
		
	}
	
}
