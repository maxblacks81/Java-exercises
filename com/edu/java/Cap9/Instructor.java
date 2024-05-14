package com.edu.java.cap9;

public class Instructor extends Person{
	
	private double salary;
	
	public Instructor(String name, int yearOfBirth, double Salary) {
		super(name, yearOfBirth);
		setSalary(Salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salario) {
		this.salary = salario;
	}
	
	public String toString() {
		String str = "";		
		str += super.toString() + " - Stipendio: " + getSalary();		
		return str;
	}
	

}
