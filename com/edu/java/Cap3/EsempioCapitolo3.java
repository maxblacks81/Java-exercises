package com.edu.java.cap3;

public class EsempioCapitolo3 {

	public static void main(String[] args) {
//		CashRegister vendita1 = new CashRegister(20.0);
//		
//		
//		vendita1.recordPurchase(29, 1);
//		vendita1.recordPurchase(20, 2);
//		vendita1.recordTaxablePurchase(10, 1);
//		vendita1.receivePayment(100);
//		System.out.println("Pezzi venduti: " + vendita1.getItemCount());
//		System.out.println("Vendita: " + vendita1.getPurchased());
//		System.out.println("Totale Resto: " + vendita1.changeToGive());
//	
//		Forno f1 = new Forno();
//		f1.setPower(1);
//		f1.setTime(200);
//		f1.start();
		Person p1 = new Person("Max");
		Person p2 = new Person("Pippo");
		Person p3 = new Person("Paolo");
		Person p4 = new Person("Megan");
		p1.befriend(p2);
		p1.befriend(p3);
		p1.befriend(p4);
		
		System.out.println(p1.getName() + " e' amico di : " + p1.getFriendNames());
		System.out.println("Totale amici: " + p1.getFriendCount());
		p1.unfriend(p2);
		System.out.println(p1.getName() + " e' amico di : " + p1.getFriendNames());
		System.out.println("Totale amici: " + p1.getFriendCount());
	}
}
