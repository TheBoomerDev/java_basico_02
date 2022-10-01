package main.patrones.mvc;

import java.util.ArrayList;

public class ProductosModel {
	
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
	
	private static ProductosModel getProductRandom (int rndId) { 
		
		Tools tools = Tools.getInstance();
		
		ProductosModel producto = new ProductosModel();
		producto.id = Math.abs(tools.getRandomInt(rndId));
		producto.name = tools.getRandomName("Producto");
		producto.precio = Math.abs(tools.getRandomInt(rndId) / 1000);
		
		return producto;
		
	}
	
	public static ArrayList<ProductosModel> listaProductos(){
		
		ArrayList<ProductosModel> lista = new ArrayList<ProductosModel>();
		for (int i = 0; i < 1000; i++) {
			ProductosModel producto = ProductosModel.getProductRandom(i);
			lista.add(producto);
		}
		return lista;	
	}

}
