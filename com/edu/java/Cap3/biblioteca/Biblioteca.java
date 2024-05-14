package biblioteca;


import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	
	private ArrayList<Documento> biblio = new ArrayList<Documento>();
	
	public Biblioteca() {
		menu();
	}
	
	public void importaDocumenti(){
		
		Scanner s = new Scanner(System.in);
		String scelta, titolo, lingua, genere;
		int pagine;
		double prezzo;
		
		System.out.print("Seleziona una lettera per il tipo di documento da inserire "
				+ "(Libro=L, Dizionario=D, Quotidiano=Q, Compact Disk=CD): ");
		scelta = s.nextLine();
		
		switch(scelta) {
			case "L":
				System.out.print("Titolo: ");
				titolo = s.nextLine();
				System.out.print("Pagine: ");
				pagine = s.nextInt();
				System.out.print("Prezzo: ");
				prezzo = s.nextDouble();
				
				
				biblio.add(new Libro("L", titolo, pagine, prezzo));			
				break;
				
			case "D":
				System.out.print("Titolo: ");
				titolo = s.nextLine();
				System.out.print("Prezzo: ");
				lingua = s.nextLine();
				
				Dizionario diz = new Dizionario("D", titolo, lingua);
				biblio.add(diz);
				break;
				
			case "Q":
				System.out.print("Titolo: ");
				titolo = s.nextLine();
				System.out.print("Lingua: ");
				prezzo = s.nextDouble();
				Quotidiano quotidiano = new Quotidiano("Q", titolo, prezzo);
				biblio.add(quotidiano);
				break;
				
			case "C":
				System.out.print("Titolo: ");
				titolo = s.nextLine();
				System.out.print("Genere: ");
				genere = s.nextLine();
				
				
				Compactdisk cd = new Compactdisk("CD", titolo, genere);
				biblio.add(cd);
				break;
	
			default:
				System.out.println("Scelta errata");
		}
		
	}
	
	public void visualizzaDocumenti() {
		for(int i=0; i<biblio.size(); i++) {
			biblio.get(i).toString();
		}
	}
	
	public ArrayList <Documento> ricercaDocumenti(int codice) {
		ArrayList<Documento> d = new ArrayList<Documento>();
		
		for(Documento doc: biblio) {
			if (doc.getId() == codice) {
				d.add(doc);			
			}	
		}
		return d;
	}
	/*
	public void modificaDocumenti() {
		Scanner s = new Scanner(System.in);
		String scelta_tipo = "", str;	
		Double prezzo_nuovo;
		int cod;
		
		System.out.print("Seleziona una lettera per il tipo di documento da modificare "
				+ "(Libro=L, Dizionario=D, Quotidiano=Q, Compact Disk=CD): ");
		scelta_tipo = s.nextLine();
		
		switch(scelta_tipo) {
		
			
			case "L":
				System.out.print("Digita il codice del libro da  modificare: ");
				cod = s.nextInt();
				Libro l = (Libro)
				//System.out.println("Digita titolo per modificare il titolo");
				System.out.println("Digita tipo per modificare il tipo");
				System.out.println("Digita prezzo per modificare il prezzo ");
				System.out.println("Digita pagine per modificare il pagine");
				
				str = s.nextLine();
				
				switch(str) {
					case "titolo":
						
						break;
					case "tipo":
					
						break;
					case "prezzo":
						
						break;
					case "pagine":
						
						break;
					
						
					
				}
				
				break;
			case "D":
				System.out.print("Digita il codice del dizionario da  modificare: ");
				cod = s.nextInt();
				
				System.out.println("Digita titolo per modificare il titolo");
				System.out.println("Digita tipo per modificare il tipo");
				System.out.println("Digita lingua per modificare il lingua ");

				str = s.nextLine();
								
				switch(str) {
				case "titolo":
					
					break;
				case "tipo":
				
					break;
				case "prezzo":
					break;
					
				}
				break;
				
			case "Q":
				System.out.print("Digita il codice del quotidiano da  modificare: ");
				cod = s.nextInt();
				
				System.out.println("Digita nome per modificare il nome");
				System.out.println("Digita tipo per modificare il tipo");
				System.out.println("Digita prezzo per modificare il prezzo ");
				
				str = s.nextLine();
				switch(str) {
				case "nome":
					
					break;
				case "tipo":
				
					break;
				case "prezzo":
					break;
					
				}
				
				break;
			case "CD":
				System.out.print("Digita il codice del cd da  modificare: ");
				cod = s.nextInt();
				
				
				
				System.out.println("Digita titolo per modificare il titolo");
				System.out.println("Digita tipo per modificare il tipo");
				System.out.println("Digita genere per modificare il genere ");
				
				str = s.nextLine();
				
				switch(str) {
				case "nome":
					
					break;
				case "tipo":
				
					break;
				case "genere":
					break;
					
				}
				
				
				break;
			default:
				System.out.println("Scelta errata");
		}
		
	}
	
	*/
	public void cancellaDocumenti() {
		
		
	}
	
	
	public void menu() {
		int scelta = 0;
		
		while(scelta > 0) {
			System.out.println("1 - Visualizza i documenti");
			System.out.println("2 - Importa documenti");
			System.out.println("3 - Modifica documenti");
			System.out.println("4 - Cancella documenti");
			System.out.println("-1 - Esci");
		
			switch(scelta) {
				case 1: 
					visualizzaDocumenti();
					break;
				case 2: 
					importaDocumenti();
					break;
				case 3: 
					//;
					break;
				case 4: 
					cancellaDocumenti();
					break;
				default:
					System.out.println("Scelta errata");
			}
		}			
	}

	public static void main(String[] args) {
		
		
		
		

	}

}
