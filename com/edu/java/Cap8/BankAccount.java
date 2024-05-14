package com.edu.java.cap8;

public class BankAccount {

	private double balance;
	private int accountNum;
	private static int lastAssignedNumber=1000;
	
	
	public BankAccount() {
		accountNum = lastAssignedNumber++;
		balance = 0.0;		
	}
	
	public BankAccount(double amount) {
		accountNum = lastAssignedNumber++;
		this.balance = amount;
	}
	
	public void deposit(double amount) {
		if (amount >= 0.0) {
			this.balance += amount;
		} else {
			System.out.println("Valore passato non valido");
		}
		System.out.println("Saldo corrente: " + this.getBalance());
	}
	
	public void withDraw(double amount) {
		if (this.balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Prelievo non disponibile");
		}
		System.out.println("Saldo corrente: " + this.getBalance());
	}
	
	/*
	 * Ritorno il saldo
	 */
	public double getBalance() {
		return balance;
	}
	
	public BankAccount depositImmutable(double amount) {
		BankAccount ba = new BankAccount(amount  + this.balance);
		return ba;
	}
	
	public BankAccount withDrawImmutable(double amount) {
		if (amount < this.balance) {
			BankAccount ba = new BankAccount((amount * -1) + this.balance);
			return ba;
		} else {
			System.out.println("Prelievo non possibile");
			return null;
		}
		
		
	}
}
