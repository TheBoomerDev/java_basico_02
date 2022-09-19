package main;

public class comparaciones {

	public static void main(String[] args) {

		int entero01 = 1;
		Integer entero02 = 1;
		
		System.out.println(entero02);
		
		comparaciones obj01 = new comparaciones();
		System.out.println(obj01); // main.comparaciones@70177ecd
		
		comparaciones obj02 = new comparaciones();
		System.out.println(obj02); // main.comparaciones@70177ecd
		
	
		// Comparación de objetos -> Siempre false
		System.out.println(obj01 == obj02);
		
		String texto01 = "hola";
		String texto02 = "hola";
		System.out.println(texto01 == texto02);
		System.out.println(texto01.equals(texto02));
		
		
	}

}
