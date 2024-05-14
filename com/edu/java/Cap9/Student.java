package com.edu.java.cap9;

public class Student extends Person{
	
	private String specialized;
	
	public Student (String name, int birthOfYear, String discipline) {
		super(name, birthOfYear);
		this.specialized = discipline;
	
	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}
	
	public String toString() {
		String str = "";
		str += super.toString() + " - Specializzazione : " + this.specialized;
		return str;
	}
		
}
