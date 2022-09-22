package main.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaReduce {

	public static void main(String[] args) {

		String[] alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z".split(" ");
		
		
	      
	      Stream<Object> lista02 = list.stream()
	    		  .filter((str)->{
	    		    	 return (str != null);
	    		  })
	    		  .map((str)->{
	    	  if (str == null) return "-";
	    	  return ("1-"+str.toLowerCase());
	      });
	       
	     
	     System.out.println("Lista 02");
	     for (Object string : lista02.toArray()) {
			System.out.println(string);
	     }
	     
	     System.out.println("Lista Original");
	     for (String string : list) {
			System.out.println(string);
	     }
	     
	     
	     
	     
	}

}
