package main.patrones.factoria.factory;

public interface CuentaBanco {
	
	void ingresar(int cantidad);
	
	boolean retirar(int cantidad);
	
	boolean transferir(int cantidad, CuentaBanco cuenta);
	
	void printSaldo();
	
}
