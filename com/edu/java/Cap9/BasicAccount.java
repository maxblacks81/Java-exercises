package com.edu.java.cap9;


public class BasicAccount extends BankAccount{
	private double limit;
	
	public BasicAccount() {
		super();
		setLimit(30.0);
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public void withDraw(double amount) {
		if (super.getBalance() < amount) {
			super.balance = super.balance - amount - getLimit();
		} else {
			super.balance -= amount;
		}				
	}
}
