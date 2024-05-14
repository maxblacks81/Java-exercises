package com.edu.java;

//import java.util.ArrayList;

public class CashRegister {
	private double purchase;
	private double payment;
	private int countArticles;
	//private ArrayList <Coin> coins = new ArrayList <>(); 
	
	
	public CashRegister() {
		purchase = 0;
		countArticles = 0;
		payment = 0;
	}
	
	public void recordPurchase(double amount) {
		purchase += amount;
		countArticles++;
		System.out.println("Alla cassa devi pagare per un valore di Euro:" + amount);
	}
	
	public void receivePayment(int count, Coin coinType) {
		payment += count * coinType.getValue();
		System.out.println("Ricevuto denaro per Euro: " + payment);
	}
	
	public void clear() {
		purchase = 0;
		countArticles = 0;
	}
	
	public double giveChange() {
		
		double change = payment - purchase; 
		purchase = 0;
		payment = 0;
		
		return change;
	}
	
	public int giveChange(Coin coinType) {
		double change = payment - purchase;
		int nCoin = (int) (change / coinType.getValue());
		return nCoin;
	}
		
	
}
