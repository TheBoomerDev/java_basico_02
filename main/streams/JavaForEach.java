package main.streams;

import java.util.ArrayList;
import java.util.List;

public class JavaForEach {

	public void show(String str) {
		System.out.println("S:"+str);
	}
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
	      list.add("A");
	      list.add("B");
	      list.add(null);
	      list.add("D");
	      list.add("E");

	      // Hasta Ahora
	      for (String string : list) {
			System.out.println("C:"+string);
	      }
	      
	      list.stream().forEach((str)-> {
	    	  System.out.println("ST:"+str);
	      });
	      
	      // filter null value
	      list.stream().forEach(System.out::println);
	      
	      JavaForEach mostrar = new JavaForEach();
	      list.stream().forEach(mostrar::show);
	      
	      
	      

	}

}
