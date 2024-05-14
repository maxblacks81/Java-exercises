package com.edu.java.cap9;

public class Manager extends Employee{
	private double bonus;
	
	
	public Manager(String name, double salary, double bonus) {
		super(name, salary);
		setBonus(salary);
	}
	
	public void setBonus(double bonus_manager) {
		this.bonus = bonus_manager;		
	}
	
	public String toString() {
		String str = "";		
		str += "Nome impiegato: " + super.name + "\n" + "Stipendio € : " + super.baseSalary + " con bonus di: " + this.bonus + "€ \n" + "Tipo Impiegato: " + "Manager";		
		return str;
	}
	
	
}
