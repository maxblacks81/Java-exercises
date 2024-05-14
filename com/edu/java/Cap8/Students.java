package com.edu.java.cap8;

import java.util.ArrayList;
import java.util.Scanner;

import citta.Studente;

public class Students {
	
	ArrayList<Student> studs;
	
	public Students() {
		studs = new ArrayList<>();
	}
	
	public void registraStudente() {
		Scanner s = new Scanner(System.in);
		Student stu = new Student ();
	
		studs.add(stu);
		
		System.out.println("Registrazione effettuata");
	}
	
	public void mostraElencoStudenti() {
		for(Student s: studs) {
			System.out.println(s.toString());
		}
	}
	
	public void registraVoti() {	
		
		for(Student s: studs) {
			System.out.println("Registra i voti di " + s.getName());
			s.setScores();
		}		
	}
	
	public void mostraVoti() {
		for(Student s: studs) {
			s.getSumWithoutMin();
		}
	}
	
	
}
