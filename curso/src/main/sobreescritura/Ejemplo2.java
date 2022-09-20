package main.sobreescritura;

public class Ejemplo2 {
	
	private int id = 0;
	
	public Ejemplo2(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Producto "+this.id;
	}

	public static void main(String[] args) {

		Ejemplo2 ej = new Ejemplo2(2);
		
		System.out.println(ej);
		System.out.println(ej.toString());
		
	}
}
