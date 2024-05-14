package com.edu.java.cap3;

public class CashRegister {
	
	private int itemCount;
	private double purchased;
	private double payment;
	private double taxRate;
	private double taxedValue;
	
	
	public CashRegister(double tax) {
		itemCount = 0;
		purchased = 0;
		payment = 0;
		taxRate = tax;
		taxedValue = 0;
		
	}
	
	/**per gli articoli soggetti a tassazione
	 * sul valore value imposto la tassa
	 * **/
	public void recordTaxablePurchase(double value, int items){
		itemCount += items;
		taxedValue = value * taxRate/100;
		purchased += value + taxedValue;		
	}
	
	/**per gli articoli esentasse*/
	public void recordPurchase(double value, int items) {
		itemCount += items;
		purchased += value;
	}
	
	public void receivePayment(double value) {
		payment += value;
	}
	
	public double changeToGive() {
		return (payment - purchased);
	}

	public int getItemCount() {
		return itemCount;
	}
	
	public double getTotalTax(){
		return 0.0;
	}

	public double getPurchased() {
		return purchased;
	}
	
	
}
