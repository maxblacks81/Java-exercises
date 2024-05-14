package com.edu.java.cap9;


public class BankAccount {
	protected double balance;
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
		this.balance += amount;		
		System.out.println("Depositato su Conto corrente nr°: " + this.accountNum + " - €: " + amount);
	}
	
	public void withDraw(double amount) {
		
		balance -= amount;
		System.out.println("Prelevato da Conto corrente nr°: " + this.accountNum + " - €: " + amount);
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}	
		
	public double getBalance() {
		return balance;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String toString() {
		String str = "" ;
		str = "Conto corrente nr°: " + this.accountNum + " - Saldo attuale €" + getBalance();
		return str;
	}
	
	public void monthEnd() {
		
	}
	
}
