package com.edu.java.cap9;

public class SquareSequence implements Sequence {	
	private static int n;
	
	public int next() {
		n++;
		return n*n;
	}

}
