package main.patrones.callback;

public interface Respuesta {
	
	void clickado(boolean isClicked);
	
	void error(String mensaje);
	
	int contador(int currentAmount);

}
