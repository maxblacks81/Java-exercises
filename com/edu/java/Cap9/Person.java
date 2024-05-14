package com.edu.java.cap9;

public class Person {
	String name;
	int birthYear;
	
	public Person (String name, int yearOfBirth) {
		this.setName(name);
		this.birthYear = yearOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String str= "";		
		str += "Nome: " + this.getName() + " - Nato nel: " + this.birthYear + "\n";		
		return str;
	}

}
