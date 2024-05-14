package com.edu.java.cap8;
import java.util.ArrayList;
import java.util.Scanner;
public class EsempioCapitolo8 {
	
	public static void menu() {
		
		
		System.out.println("Scegli le monete per pagare");
		System.out.println("1-2E");
		System.out.println("2-1E");
		System.out.println("3-0.50E");
		System.out.println("4-0.20E");
		System.out.println("5-0.10E");
		
	}
	
	public static void main(String[] args) {
		double amountToPay = 10.0, received;
		ArrayList<Coin> coins = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		Scanner m = new Scanner(System.in);
		boolean devipagare = true;
		int numeroMonete;
		CashRegister cassa1 = new CashRegister();
		
		
		cassa1.recordPurchase(amountToPay);
		received = 0.0;
		while(devipagare) {
			
			
			numeroMonete = 0;
			menu();
			
			switch(s.nextInt()) {
				case 1:					
					System.out.println("Selezionato 2Euro ");
					System.out.println("Nr° di monete: ");
					numeroMonete = m.nextInt();
					Coin monetada2 = new Coin(2,"2");
					received += 2 * numeroMonete;
					cassa1.receivePayment(numeroMonete, monetada2);
					break;
					
				case 2:
					System.out.println("Selezionato 1Euro ");
					System.out.println("Nr° di monete: ");
					numeroMonete = m.nextInt();
					Coin monetada1 = new Coin(1,"1");
					received += 1 *numeroMonete;
					cassa1.receivePayment(numeroMonete, monetada1);
					break;
				case 3:
					System.out.println("Selezionato 0.50Euro ");
					System.out.println("Nr° di monete: ");
					numeroMonete = numeroMonete;
					Coin monetada05 = new Coin(0.50,"0.50");
					received += 0.50 * numeroMonete;
					cassa1.receivePayment(numeroMonete, monetada05);
					break;
				case 4:
					System.out.println("Selezionato 0.20Euro ");
					System.out.println("Nr° di monete: ");
					numeroMonete = m.nextInt();
					Coin monetada020 = new Coin(0.20,"0.20");
					received += 0.20 * m.nextInt();
					cassa1.receivePayment(m.nextInt(), monetada020);
					break;
				case 5:
					System.out.println("Selezionato 0.10Euro ");
					System.out.println("Nr° di monete: ");
					numeroMonete = m.nextInt();
					Coin monetada010 = new Coin(0.10,"0.10");
					received += 0.10 * numeroMonete;
					cassa1.receivePayment(numeroMonete, monetada010);
					break;
				default:
					System.out.println("Scelta errata");
			}
			System.out.println("Consegnati Euro " + received); 
			if (received == amountToPay) {
				devipagare = false;
			} else if (received > amountToPay) {
				System.out.println("Resto da fornire per Euro: " + cassa1.giveChange());
				devipagare = false;
				
				
			System.out.println("Area del cerchio");
			}
			
		}
		
		
		
	}

}
