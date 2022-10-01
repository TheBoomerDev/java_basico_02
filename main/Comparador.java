package main;

import java.util.Comparator;

public class Comparador  implements Comparator<Integer> {
	
	// 1 -> Primero Mayor
	// 0 -> Iguales
	// -1 -> Primero Es Menor
	
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1 - o2);
    }
}