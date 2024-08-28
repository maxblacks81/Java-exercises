package com.edu.java;

public class InsertionSorter {
	
	/**
	 * Ordina un array con l'algoritmo di Insertion Sorter
	 * @param array L'array da ordinare
	 */
	
	
	public static void sort(int[] array) {
		int next;
		for(int i=1; i<array.length; i++) {			
			next = array[i];			
			int j = i;
			while(j>0 && array[j]>next) {
				array[j] = array[j-1];
				j--;				
			}
			array[j] = next;
		}
	}
}
