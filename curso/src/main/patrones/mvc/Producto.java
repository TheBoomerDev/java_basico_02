package main.patrones.mvc;

import java.util.Comparator;

public class Producto implements Comparator<Producto> {
	
	private int id = 0;
	private String name = "";
	private int precio = 100;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	} 

	public static Producto fromProductoModel(ProductosModel p) {
		Producto prod = new Producto();
		prod.id = p.getId();
		prod.name = p.getName();
		prod.precio = p.getPrecio();
		
		return prod;
	}
	
	@Override
	public int compare(Producto o1, Producto o2) {
		String o1Name = o1.getName();
		String o2Name = o2.getName();
		
		if (o1Name.equals(o2Name)) return 0;
		
		return (o1Name.compareTo(o2Name));
	}
	
}
