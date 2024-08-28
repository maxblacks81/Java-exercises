package com.edu.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ContactManagement {
	
	public static void showMenu() {
		System.out.println("1 - Ricerca per nome");
		System.out.println("2 - Ricerca per numero");
		System.out.println("0 - Esci");
		System.out.print("La tua scelta: ");
	}

	public static void main(String[] args) throws FileNotFoundException {
	
		//Load List Contact
		ArrayList<Contatto> contatti = new ArrayList<>();
		Scanner s = new Scanner(new File("/home/maggioli/temp/contacts"));
		String[] contact;
		while(s.hasNext()) {			
			contact = s.next().split(";");		
			contatti.add(new Contatto(contact[1], contact[0]));
		}
		
		
		System.out.println("Loading contacts....");
		for(Contatto c : contatti) {
			System.out.println(c.toString());
		}
		
		//Show Menu
		Contatto res;
		Scanner t = new Scanner(System.in);
		String scelta, input; boolean fine=false; 		
		
		do{
			try {
				showMenu();
				scelta = t.nextLine();			
				switch(scelta) {
			
				case "1":
					Collections.sort(contatti, new ContactComparingByName());
					System.out.println("Loading contacts....");
					for(Contatto c : contatti) {
						System.out.println(c.toString());
					}
					
					System.out.println("Digita il nome: ");
					input = t.nextLine();					
					res = BinarySearch.searchByName(contatti, 0, contatti.size(), input);
					if (res != null) {
						System.out.println("Il numero associato a " + input + " e' " + res.getTelefono());												
					} else {
						System.out.println("Nessun Contatto trovato");
					}
				break;
				
				case "2":
					Collections.sort(contatti, new ContactComparatorByPhone());
					System.out.println("Loading contacts....");
					for(Contatto c : contatti) {
						System.out.println(c.toString());
					}
					
					System.out.println("Digita il nome: ");
					input = t.nextLine();
					res = BinarySearch.searchByPhone(contatti, 0, contatti.size(), input);
					if (res != null) {
						System.out.println("Il nome associato a " + input + " e' " + res.getNome());												
					} else {
						System.out.println("Nessun Contatto trovato");
					}
				break;
				
				case "0":
					fine = true;
				break;
				
				default:
					System.out.println("Scelta errata");					
			}
			} catch (InputMismatchException exception) {
				System.out.println("Acquisizione dati errata");
			} catch (NoSuchElementException exception) {
				System.out.println("Acquisizione dati errata");
			}
			
		} while(!fine);
		s.close();
		t.close();
	}
}
