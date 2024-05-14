package com.edu.java;

public class Paycheck {
	private final int oreMensili = 40;
	private int oreLavorate;
	private double pagaoraria;
	private String nominativo;
	private String cf;
	private String periodo;
	
	Paycheck(int ore, double retrib, String nomeCognome, String CF, String meseanno){
		this.oreLavorate = ore;
		this.pagaoraria = retrib;
		this.nominativo = nomeCognome;
		this.cf = CF;
		this.periodo = meseanno;
	}
	
	public double calcolaRetribuzioneMensile() {
		if (this.oreLavorate > this.oreMensili) {
			return (this.pagaoraria * this.oreMensili) + (this.pagaoraria * 1.50 * (this.oreLavorate - this.oreMensili));
		}
		
		return this.pagaoraria * this.oreMensili;	
	}
	
	
	
	public int getOreMensili() {
		return oreMensili;
	}

	public int getOreLavorate() {
		return oreLavorate;
	}

	public double getPagaoraria() {
		return pagaoraria;
	}

	public String getNominativo() {
		return nominativo;
	}

	public String getCf() {
		return cf;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void stampaRetribuzioneMensile() {
		System.out.println("Impiegato: " + getNominativo() + '\n' +
							"Periodo: " + getPeriodo() + '\n' +
							"Ore lavorate " + getOreLavorate() + '\n' +
						  "Stipendio: " + calcolaRetribuzioneMensile());
	}
	
	public String toString() {
		return ("Impiegato: " + getNominativo() + '\n' +
				"Periodo: " + getPeriodo() + '\n' +
				"Ore lavorate " + getOreLavorate() + '\n' +
			  "Stipendio: " + calcolaRetribuzioneMensile()
				);
	}
	
	
	
}
