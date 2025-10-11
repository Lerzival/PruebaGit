package test;

import java.util.Arrays;

public class Recursividad {

	public int encontrar(int i, int[] lista) {
	    Arrays.sort(lista);
	    return buscarRec(i, lista, 0, lista.length - 1);
	}

	private int buscarRec(int i, int[] lista, int inicio, int fin) {
	    if (inicio > fin) return -1;

	    int medio = (inicio + fin) / 2;

	    if (lista[medio] == i) return medio;
	    else if (lista[medio] > i)
	        return buscarRec(i, lista, inicio, medio - 1);
	    else
	        return buscarRec(i, lista, medio + 1, fin);
	}
}