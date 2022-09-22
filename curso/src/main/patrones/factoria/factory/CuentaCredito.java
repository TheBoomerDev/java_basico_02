package main.patrones.factoria.factory;

public class CuentaCredito implements CuentaBanco {
	
	private int saldo = 0; // 100 => 1€ => 1.00
	private int limite = 1000;
	
	protected CuentaCredito() {}

	@Override
	public void ingresar(int cantidad) {
		this.saldo = this.saldo + cantidad;
	}

	@Override
	public boolean retirar(int cantidad) {
		
		int total = this.saldo + this.limite;
		if (total < cantidad) {
			return false;
		}
		
		this.saldo = this.saldo - cantidad;
		
		return true;
	}

	@Override
	public boolean transferir(int cantidad, CuentaBanco cuenta) {
		if (cantidad > this.saldo) return false;
		
		boolean check =this.retirar(cantidad);
		if (!check) return false;
		
		cuenta.ingresar(cantidad);  
		return check;
	}

	@Override
	public void printSaldo() {
		
		int saldo = this.saldo + this.limite;
		System.out.println(saldo);
		
	}

}
