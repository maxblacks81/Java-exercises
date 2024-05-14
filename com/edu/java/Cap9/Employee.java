package com.edu.java.cap9;

public class Employee {
	protected String name;
	protected double baseSalary;
	
	public Employee(String name, double salary) {
		setName(name);
		setBaseSalary(salary);		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBaseSalary(double newSalary) {
		this.baseSalary = newSalary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return baseSalary;
	}
	
	public String toString() {
		String str = "";		
		str += "Nome impiegato: " + this.name + "\n" + "Stipendio € : " + this.baseSalary + "\n" + "Tipo Impiegato: " + "Base";		
		return str;
	}
}
