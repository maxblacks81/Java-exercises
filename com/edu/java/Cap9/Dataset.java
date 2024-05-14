package com.edu.java;

public class Dataset {
	private double[] vett;
	private int countsize;
	private int lenvett; 

	
	
	public Dataset(int lenmax) {
		this.lenvett = lenmax;
		vett = new double[lenmax];
		countsize = 0;
	}
	
	public int getCountsize() {
		return countsize;
	}

	public int getLenvett() {
		return lenvett;
	}

	public void add(double value) {
		if (this.countsize < this.lenvett) {
			this.vett[this.countsize++] = value;
		} else {
			System.out.println("Errore in inserimento valore");
		}
	}
	
	public double getSum() {
		double sum = 0.0;
			for (int i=0; i<this.lenvett; i++) {
				sum += this.vett[i];
			}				
		return sum;
	}
	
	public double getMedium() {
		return (this.getSum() / this.getCountsize());
	}
	
	public double getMax() {
		double largest;
		largest = this.vett[0];
		for(int i=0; i<this.lenvett; i++) {
			if (this.vett[i] > largest) {
				largest = this.vett[i];
			}
		}
		return largest;
	}
	
	public double getMin() {
		double smallest;
		smallest = this.vett[0];
		for(int i=0; i<this.lenvett; i++) {
			if (this.vett[i] < smallest) {
				smallest = this.vett[i];
			}
		}
		return smallest;
	}
	
}
