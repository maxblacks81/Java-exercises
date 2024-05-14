package com.edu.java.cap8;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	private String name;
	private int id;
	ArrayList<Double> scores;
	
	
	public Student (String studentName, int id) {
		this.name = studentName;
		this.id = id;
		scores = new ArrayList<Double> ();
		
	}

	public Student() {
		setName();
		setId();
		
	}
	
	public String getName() {
		return this.name;		
	}
	
	public int getId() {
		return this.id;		
	}
	
	public void setName() {
		Scanner s = new Scanner(System.in);		
		System.out.print("Inserisce il nominativo: ");
		this.name = s.next();		
	}
	
	public void setId() {
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisce l'ID: ");
		this.id = s.nextInt();
	}
	
	public void setScores() {
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci un voto dello studente - Premi -1 per uscire - ");		
		while(s.nextDouble() != -1) {
			this.scores.add(s.nextDouble());
		}
	}
	
	public double getMinScore() {
		double min = 10;
		for(double s: scores) {
			if (s <= min) {
				min = s;				
			}
		}
		return min;
	}
	
	public double doubleSumScores() {
		double sum=0.0;
		for(double s: scores) {
			sum += s;
		}
		return sum;
	}
	
	public double getSumWithoutMin() {
		return this.getSumWithoutMin() - this.getMinScore();
	}
	public void getScores() {
		
	}
	
	public String toString() {
		return "Name: " + this.name + ", ID: " + this.id;
	}
}
