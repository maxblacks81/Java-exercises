package com.edu.java;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class es14_4 {

	public static void main(String[] args) {
		Map<String, String> alunni_voti = new  TreeMap<>();
		
		boolean fine_inserimento = false;
		
		Scanner s = new Scanner(System.in);
		
		String scelta = "";
		String nome = "";
		String voto = "";
		
		while(!fine_inserimento) {
			System.out.println("1 - Inserisci alunni");
			System.out.println("2 - Elimina alunni");
			System.out.println("3 - Modifica voto");
			System.out.println("4 - Stampa tutti voti");
			System.out.println("0 - Esci");
			
			scelta = s.nextLine();
			
			switch(scelta) {
				case "1":
					System.out.println("Digita il nome dell'alunno da inserire: ");
					nome = s.nextLine();
					System.out.println("Digita il voto dell'alunno: ");
					voto = s.nextLine();
					alunni_voti.put(nome, voto);
					break;
					
				case "2":
					System.out.println("Digita il nome dell'alunno da eliminare: ");
					nome = s.nextLine();
					alunni_voti.remove(nome);
					break;
					
				case "3":
					System.out.println("Digita il nome dell'alunno da Modificare: ");
					nome = s.nextLine();
					System.out.println("Digita il voto dell'alunno: ");
					voto = s.nextLine();
					alunni_voti.put(nome, voto);
					break;
					
				case "4":
					for(String k:alunni_voti.keySet()) {
						voto = alunni_voti.get(k);
						System.out.println("Nome: " + k + " - " + voto);
					}
					break;
					
				case "0":
					
					break;
				default:
					System.out.println("Scelta errata");
			}
		}
	}

}
