package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class listas {
	
	public static void recogerLista(List<String> lista) {
		lista.add("SS");
	}
 

	public static void main(String[] args) {
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		listaNumeros.add(12);
		// listaNumeros.add('A'); // Soolo se pueden poner numeros
		
		ArrayList listaCosas = new ArrayList();
		listaCosas.add(12);
		listaCosas.add("asfa");
		listaCosas.add('A');
		
		boolean contiene = listaCosas.contains('A');
		
		// Tamaño Fijo, No puede cambiar
		int[] listaNativaVaciaConSize = new int[120]; 
		int[] listaNativaValores = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

		boolean loTiene = listaNumeros.contains(55); 
		listaNumeros.sort(new Comparador());
		
		Vector<Integer> pila = new Vector<Integer>();
		pila.add(1);
		Integer element = pila.firstElement();
		
		LinkedList<Integer> cola = new LinkedList<Integer>();
		cola.add(12);
		element = cola.element();
		
		// Utilizar los Tipos Abstractos
		List<Integer> listAbs = listaCosas;
		listAbs = pila;
		listAbs = cola;
		
		listAbs.add(12);
		listAbs.get(0); 
		
		

	}

}
