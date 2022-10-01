package main.matrices.maps;

public enum DIAS_SEMANA {
	LUNES(1),
	MARTES(2),
	MIERCOLES(3),
	JUEVES(4),
	VIERNES(5),
	SABADO(6),
	DOMINGO(7);
	
	 private final int value;

    private DIAS_SEMANA(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
 
}
