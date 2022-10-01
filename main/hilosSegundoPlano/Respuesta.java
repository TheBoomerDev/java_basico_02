package main.hilosSegundoPlano;

public interface Respuesta {
	
	void heTerminado(String termine);
	
	void error(String mensaje);
	
	int contador(int currentAmount);

}
