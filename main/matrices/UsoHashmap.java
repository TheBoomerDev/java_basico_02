package main.matrices;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import main.herencia.terrestre.Coche;

public class UsoHashmap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		
		String key = "clave";
		String value = "Valor";
		map.put(key, value);
		
		// Si existe valor para el Key
		map.containsKey(key);
		
		// Generalizar el Print de Un Map
		Set<String> keys = map.keySet();
		for (String clave : keys) {
			String valor = map.get(clave);
			System.out.println("Clave: "+clave+" - Valor: "+valor);
		}
		
		Collection<String> valores = map.values();
		for (String valor : valores) {
			System.out.println("Valor: "+valor);
		} 

		// Cualquier clase a HashMap
		Coche car = new Coche(4,5); 
		try {
			Map <String, Object> mapObj = car.toMap();
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
