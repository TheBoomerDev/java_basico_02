package main.patrones.builder.constructor;

public enum TipoBody {
	TXT(0),
	HTML(1),
	MD(2);

	private int tipo=0;
	TipoBody(int i) {
		this.tipo = i;
	}
	
	public int getValue() {
		return tipo;
	}
	
}
