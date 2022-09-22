package main.patrones.factoria.factory;

public class CuentaDebito implements CuentaBanco {
	
	private int saldo = 0; // 100 => 1€ => 1.00
	
	protected CuentaDebito() {}

	@Override
	public void ingresar(int cantidad) {
		this.saldo = this.saldo + cantidad;
	}

	@Override
	public boolean retirar(int cantidad) {

		if (cantidad > this.saldo) return false;
		
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
		System.out.println(this.saldo); 
	}
	
}
