package main.patrones.callback;

public class main {

	public static void main(String[] args) {
		Respuesta callback = new Respuesta() {

			@Override
			public void clickado(boolean isClicked) {

				System.out.println("Clickado: "+isClicked);
				
			}

			@Override
			public void error(String mensaje) {
				System.out.println("error: "+mensaje);
			}
			
			@Override
			public int contador() {
				return 3;
			}
		};
		
		Tardis drWho = new Tardis(callback);
		
		drWho.eventoClick();
		drWho.eventoContador();
		drWho.getError(); 

	}

}
