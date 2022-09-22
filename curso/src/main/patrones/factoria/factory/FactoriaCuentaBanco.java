package main.patrones.factoria.factory;

import main.patrones.mvc.Tools;

public class FactoriaCuentaBanco {
	
	private static Tools tools = Tools.getInstance();
	
	private FactoriaCuentaBanco() {}
	
	public static CuentaBanco getCuenta(TipoCuenta tipoCuenta, int saldoInicial) {
		
		switch (tipoCuenta) {
		case CREDITO: {
			return generateCuentaCredito(saldoInicial);
		}
		case DEBITO: {
			return generateCuentaDebito(saldoInicial);
		}
		case RANDOM:
		default:
			return generateCuentaRandom(saldoInicial);
		}
		
	}

	private static CuentaBanco generateCuentaRandom(int saldoInicial) {
		TipoCuenta[] tiposCuenta = TipoCuenta.values();
		
		int rndPos = tools.getRandomInt(tiposCuenta.length);
		
		TipoCuenta tipo = tiposCuenta[rndPos];
		return getCuenta(tipo, saldoInicial);
	}

	private static CuentaBanco generateCuentaDebito(int saldoInicial) {
		
		CuentaDebito cuenta = new CuentaDebito();
		cuenta.ingresar(saldoInicial);
		return cuenta;
	}

	private static CuentaBanco generateCuentaCredito(int saldoInicial) {
		CuentaCredito cuenta = new CuentaCredito();
		cuenta.ingresar(saldoInicial);
		return cuenta;
	}

}
