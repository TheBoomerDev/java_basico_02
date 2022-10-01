package main.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaFilter {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
	      list.add("A");
	      list.add("B");
	      list.add(null);
	      list.add("D");
	      list.add("E");
	      
	      
	     Stream<String> lista02 = list.stream().filter((str)->{
	    	 return (str != null);
	     });  
	     
	     System.out.println("Lista 02");
	     for (Object string : lista02.toArray()) {
			System.out.println(string);
	     }
	     
	     System.out.println("Lista Original");
	     for (String string : list) {
			System.out.println(string);
	     }
	     
	     
	     // =========== FORMA NATIVA
	     List<String> aux = new ArrayList<String>();
	     for (String string : list) {
	    	 if (string != null) {
	    		 aux.add(string);
	    	 }
	     }
	     
	     System.out.println("Lista Forma Nativa");
	     for (String string : list) {
			System.out.println(string);
	     }
	     
	     
	}

}
