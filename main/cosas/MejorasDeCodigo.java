package main.cosas;

public class MejorasDeCodigo {
	
	// Mejorable -> Muy de Junior ;)
	public int getNumeroFromString(String numero) {
			
		if (numero != null) {
			
			return Integer.valueOf(numero);
			
		}else {
			return 0;
		} 
	}
	
	public int getNumeroFromStringV02(String numero) {
		// Clausula de Salvaguarda -> Sal lo antes posible
		if (numero == null) return 0;
		
		try {
			Integer value = Integer.valueOf(numero); // " "
			
			return (value != null) ? value : 0;
			
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getLocalizedMessage());
			return 0;
		}
		
	}
	

	public static void main(String[] args) {
		MejorasDeCodigo mejoras = new MejorasDeCodigo();
		int n01 = mejoras.getNumeroFromString("0");
		int n02 = mejoras.getNumeroFromStringV02("");
		
		String format = "N01-> %d || N02-> %d";
		String msg = String.format(format, n01, n02);
		System.out.println(msg);
	}

}
