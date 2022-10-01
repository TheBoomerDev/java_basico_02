package main.patrones.factoria;

import java.util.ArrayList;
import java.util.List;

import main.patrones.factoria.factory.CuentaBanco;
import main.patrones.factoria.factory.FactoriaCuentaBanco;
import main.patrones.factoria.factory.TipoCuenta;
import main.patrones.mvc.Tools;

public class Main {
	
	private static Tools tools = Tools.getInstance();

	public static void main(String[] args) {
		/*
		 * El patron se basa en:
		 * 1.- Descargar la responsabilidad de la creación de un objeto en la clase Constructora
		 * 2.- Es la clase constructora la que decide que objeto y como se crea
		 * 3.- Nos devuelve un objeto de la clase abstracta o de la interface que usemos como base de objetos.
		 */
		
		CuentaBanco cuenta01 = FactoriaCuentaBanco.getCuenta(TipoCuenta.CREDITO, 100000000);
		
		CuentaBanco cuenta02 = FactoriaCuentaBanco.getCuenta(TipoCuenta.DEBITO, 1000);
		
		CuentaBanco cuenta03 = FactoriaCuentaBanco.getCuenta(TipoCuenta.RANDOM, 666);
		List<CuentaBanco> cuentas = new ArrayList<CuentaBanco>();
		cuentas.add(cuenta01);
		cuentas.add(cuenta02);
		cuentas.add(cuenta03);
		
		for (int i = 0; i < 15000; i++) {
			
			int pCuenta1 = tools.getRandomInt(cuentas.size());
			cuenta01 = cuentas.get(pCuenta1);
			
			int pCuenta2 = tools.getRandomInt(cuentas.size());
			cuenta02 = cuentas.get(pCuenta2);
			
			int cantidad = tools.getRandomInt(1000);
			System.out.println("Cantidad:"+cantidad);
			
			// Operaciones
			int op = tools.getRandomInt(6);
			
			switch (op) {
			case 0: {
				cuenta01.ingresar(cantidad);
				cuenta02.retirar(cantidad);
				break;
			}
			
			case 1:{
				cuenta01.ingresar(cantidad);
				break;
			}
			
			case 2:{
				cuenta01.retirar(cantidad);
				break;
			}
			
			case 3:{
				cuenta02.ingresar(cantidad);
				break;
			}
			
			case 4:{
				cuenta02.retirar(cantidad);
				break;
			}
			
			case 5:{
				cuenta02.transferir(cantidad, cuenta01);
				break;
			}
			
			case 6:{
				cuenta01.transferir(cantidad, cuenta02);
				break;
			}
			
			default:
				System.out.println("Siguiente, Por favor.");
			}  
			
		}
		 
		System.out.println("Cuenta 01");
		cuenta01.printSaldo();
		
		System.out.println("Cuenta 02");
		cuenta02.printSaldo();
		
	}

}
