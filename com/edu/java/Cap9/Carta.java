package com.edu.java;
import java.util.*;

public class Carta {
	String valore;
	
	public Carta(String val) {
		valore = val;
		
	}
	
	public String getDescription() {
		String semeInput = null, valueInput = null, str="";
		
		if (valore.length() == 2) {
			valueInput = valore.substring(0,1);
			semeInput = valore.substring(1,2);			
		} else if (valore.length() == 3) {
			valueInput = valore.substring(0,2);
			semeInput = valore.substring(2,3);
		}
		
		
		System.out.println("Valore: " + valueInput);
		System.out.println("Seme: " + semeInput);
		
		switch(valueInput) {
			case "A":
				str += "Ace of ";
				break;
			case "J":
				str += "Jack of ";
				break;
			case "Q":
				str += "Queen of ";
				break;
			case "K":
				str += "King of ";
				break;
			case "2":
				str += "2 of ";
				break;			
			case "3":
				str += "3 of ";
				break;			
			case "4":
				str += "4 of ";
				break;			
			case "5":
				str += "6 of ";
				break;			
			case "6":
				str += "6 of ";
				break;			
			case "7":
				str += "7 of ";
				break;			
			case "8":
				str += "8 of ";
				break;			
			case "9":
				str += "9 of ";
				break;			
			case "10":
				str += "10 of ";
				break;			
			
			default:
				str += "Unknown_Value";
		}
		
		if (!str.equals("Unknown_Value")) {
			
			switch(semeInput) {
			case "D":
				str += "Diamonds";
				break;
			case "H":
				str += "Hearts";
				break;
			case "S":
				str += "Spades";
				break;
			case "C":
				str += "Clubs";
				break;			
			default:
				str += "-Unknown_Seed";
			}	
			
			
		}
		
				
		return str;
	}
}
