package main.patrones.mvc;

import java.util.ArrayList;

public class Controller {
	
private Controller() {}
	 
	private static Controller instance =  new Controller();
	public static Controller getInstance() { 		
		return instance;
	}
	
	public void listaProductos (){
		
		// Modelos - Recoge los Datos
		ArrayList<ProductosModel> lista = ProductosModel.listaProductos();
		
		
		ArrayList<Producto> listaAux = new ArrayList<Producto>();
		
		// Controlador -> Transformando los datos
		for (ProductosModel pModel : lista) {
			// Patron Adaptador
			Producto prod = Producto.fromProductoModel(pModel);
			listaAux.add(prod);
		}
		
		// Para la Vista
		Vista vista = new Vista(listaAux);
		vista.show();
	}

}
