package com.edu.java;

public class BubbleSorter {
	
	public static boolean ordinato = false;
	
	public static void sort(int[] a) {
		
		while(!ordinato) {
			for(int i=0; i<a.length-1; i++) {
				if(a[i+1] < a[i]) {
					swap(a, i, i+1);
				}
			}
			ordinato = checkOrdered(a);
		}
	}
	
	public static boolean checkOrdered(int[] a) {
		ordinato = true;
		for(int i=0; i<a.length-1 && ordinato; i++) {
			if(a[i] > a[i+1]) {
				ordinato = false;
			}
		}
		return ordinato;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
