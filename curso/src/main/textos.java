package main;

public class textos {

	public static void main(String[] args) {

		String texto = "Hola, Mundo";
		char[] listaChars = new char[] {'H','o','l','a',',',' ','M','u','n','d','o'};
		
		texto.charAt(0);
		char ch = listaChars[0];
		
		boolean contiene = texto.contains("Ho");

		String minus = texto.toLowerCase();
		String upper = texto.toUpperCase();
		
		System.out.println(minus);
		System.out.println(upper);
		System.out.println(texto);
		
		// Comparación de Mayusculas
		
		System.out.println( "Hola" == "hola" );
		System.out.println( "Hola".toLowerCase() == "hola".toLowerCase() );
		
		String texto01 = "HOLA".toLowerCase();
		String texto02 = "hola".toLowerCase();
		System.out.println(texto01 == texto02); // Comparando el indice del registro memoria
		System.out.println(texto01.equals(texto02));
		
		// Irrelevante las mayusculas y minusculas
		String email = "USER@EMAIL.COM";
			   email = "user@email.com";
			   
        String dominio = "GOOGLE.com";
        	   dominio = "google.com";
		
	}

}
