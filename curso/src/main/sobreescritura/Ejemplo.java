package main.sobreescritura;

public class Ejemplo {
	
	 public String formateo (int p1, int p2, String name, boolean porQueSi){
		 System.out.println("Full Param");
		 String formato1 = "P:  %s -> %s, %s";
		 String formato2 = "S:  %s :: %s => %s";
		 if (porQueSi) {
			 return String.format(formato1, p1, p2, name);
		 }
		 
		 return String.format(formato2, p1,p2,name);
	 }
	 
	 public String formateo (int p1, int p2, String name) {
		 System.out.println("3 Param");
		 return formateo(p1,p2,name,false);
	 }
	 
	 public String formateo(int p1, int p2) {
		 System.out.println("2 Param");
		 return formateo(p1,p2,"Producto");
	 }
	 
	 public String formateo(Integer p1) {
		 System.out.println("1 Param");
		 return formateo(p1,p1);
	 }
	 
	 public String formateo (Object...args) {
		 System.out.println("ARGS");
		 return formateo(args[0], args[1], args[2], args[3]);
	 }
	 
	// =================
		// Podemos llamar a 2 funciones exactamente igual, siempre y cuando los parametros de entrada
		// sean diferentes.
		public int getX(int entero) {
			return 0;
		}
		
		public int getX(String str) {
			return 0;
		}
		
		// NO es una sobreescritura si NO devuelve el mismo tipo de dato
		public String getX(float c) {
			return "";
		}
		
		
	 
	 
	 public static void main(String[] args) {
		 Ejemplo ej = new Ejemplo();
		 ej.formateo(1);
		 ej.formateo("1"); 
		 
		 
		 ej.getX(0);
		 ej.getX("");
		 // ej.getX(true);
		 
		 
	 }

}
