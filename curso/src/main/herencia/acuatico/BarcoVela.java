package main.herencia.acuatico;

import main.herencia.interfaces.UsaVela;

public class BarcoVela extends Barco implements UsaVela {

	@Override
	public boolean hayViento() {
		// TODO Auto-generated method stub
		return false;
	}

}
