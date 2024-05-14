package com.edu.java.cap9;

public class Quiz implements Measurable{
	
	private double num_punteggio = 0;
	private String str_punteggio = "";
	
	public Quiz(double val) {
		num_punteggio = val;		
	}
	
	public Quiz(String val) {
		str_punteggio = val;
	}
	
	public double getInt_punteggio() {
		return num_punteggio;
	}

	public String getStr_punteggio() {
		return str_punteggio;
	}

	public double getMeasure() {
		if (num_punteggio > 0) {
			return num_punteggio;
		} else if (str_punteggio.equals("A")) {
			return 5;
		} else if (str_punteggio.equals("B")) {
			return 4;
		} else if (str_punteggio.equals("C")) {
			return 3;
		} else if (str_punteggio.equals("D")) {
			return 2;
		} else if (str_punteggio.equals("E")) {
			return 1;
		}
		return 0;
	}
}