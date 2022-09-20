package main.cosas;

import java.text.DecimalFormat;

public class test {

	public static void main(String[] args) {
		
		"".toLowerCase().toUpperCase();
		
		int numero = 1250;
		
		String str = ""+numero;
		str = String.valueOf(numero);
		
		boolean verdadero = false;
		
		str = String.valueOf(verdadero);
		str = ""+verdadero;
		str = Boolean.toString(verdadero);
		
		
		Short enCurso = new Short("1");
		enCurso  = 1;
		
		float caso1 = 35f;
		float caso2 = 73f;
		float res = caso1 / caso2;
		
		DecimalFormat df = new DecimalFormat("0.00");
		String strRes = df.format(res);
		
		System.out.println(strRes);
		
		
		int casoI1 = 3500;
		int casoI2 = 7300;
		float resI = (float)casoI1 / (float)casoI2;
		System.out.println(resI);
		
	}

}
