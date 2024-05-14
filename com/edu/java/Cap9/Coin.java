package com.edu.java;

public class Coin {
	String name;
	double value;
	
	public Coin(double val, String str) {
		this.name = str;
		this.value = val;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getValue() {
		return this.value;
	}
	

}
