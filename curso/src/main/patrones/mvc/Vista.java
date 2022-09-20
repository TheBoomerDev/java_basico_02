package main.patrones.mvc;

import java.util.ArrayList;

public class Vista {
	
	private ArrayList<Producto> lista = new ArrayList<Producto>();

	public Vista(ArrayList<Producto> lista) {
		if (lista != null) {
			this.lista = lista;
		}
		
		Tools.getInstance().sortedList(this.lista);
	}
	
	public void show() {
		String currency = "€";
		String formato = "%s:: %s -> %s%s";
		
		for (Producto producto : lista) {
			
			String str = String.format(formato, producto.getId(), producto.getName(), producto.getPrecio(), currency);
			System.out.println(str);
		}
		
	}

}
