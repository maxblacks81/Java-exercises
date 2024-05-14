package com.edu.java.cap9;

public interface Sequence {

	default int[] values(int n) {
		int[] vett = new int[n]; 
		for (int i=0; i<n; i++) {
			vett[i] = i+1;
		}
		return vett;
	}
	
	default int next() {
		return 0;
	}
	
	default void process(Sequence seq, int valuesToProcess) {
		int v[] = new int[valuesToProcess];
		for (int i=0; i<=valuesToProcess; i++) {
			int value = seq.next();
			int lastDigit = value%10;
			v[lastDigit]++;
		}
	}
	
	public static double powerOf(int n) {
		return Math.pow(10, n);
	}
	
	public static double multiplesOf(int n) {
		return Math.abs( (int)(Math.random() * Integer.MAX_VALUE)*n);
	}
}
