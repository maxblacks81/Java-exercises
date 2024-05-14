package com.edu.java.cap9;

public class Person implements Measurable{
	
	private String name;
	private int height;
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;		
	}
		
	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public double getMeasure() {
		return getHeight();
	}
}
