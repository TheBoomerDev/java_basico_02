package main.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaMap {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
	      list.add("A");
	      list.add("B");
	      list.add(null);
	      list.add("D");
	      list.add("E");
	      
	      
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
