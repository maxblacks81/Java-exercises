package com.edu.java;

public class Sequence {
	private int[] values;
	
	public Sequence(int size) {
		values = new int[size];		
	}
	
	public void set(int i, int n) {
		values[i] = n;
	}
	
	public int get(int i) {
		return values[i];
	}
	
	public int size() {
		return values.length;
	}
	
	public boolean equals(Sequence other) {
		
		if (this.values.length != other.size()) {
			return false;
		}
		
		for(int i=0; i<this.values.length; i++) {
			if (values[i] != other.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean sameValues(Sequence other) {
		int conta;
		if (this.values.length != other.size()) {
			return false;
		}
		
		for(int i=0; i<this.values.length; i++) {
			conta =0;
			for(int j=0; j<other.size(); j++) {
				if (this.values[i] == other.get(j)) {
					conta++;
				}
			}
			if (conta == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPermutationOf(Sequence other) {
		int[] occurrence = new int[this.values.length];
		
		return true;
	}

}
