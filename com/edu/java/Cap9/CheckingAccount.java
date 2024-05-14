package com.edu.java.cap9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


/**
A checking account has a limited number of free deposits and withdrawals.
*/
public class CheckingAccount extends BankAccount{
	private int withdrawals;
	private int overdraft;
	LocalDateTime lastWithDrawDate;
	
	/**
	 Constructs a checking account with a zero balance.
	*/
	public CheckingAccount(){
		withdrawals = 0;
		overdraft = 0;
	}
		
	public void withDraw(double amount){
		
		LocalDateTime dateOperation = LocalDateTime.now();		
		//DateTimeFormatter dateoperationformatted =  DateTimeFormatter.ofPattern("yyyy-MM-dd");		
		//String overDraftDate = dateOperation.format(dateoperationformatted);
		
		final int FREE_WITHDRAWALS = 3;
		final int WITHDRAWAL_FEE = 1;
		final int WITHDRAWAL_FEE_EXTRA = 20;
		final int WITHDRAWAL_FEE_EXTRA_MONTH = 30;
		
		
		if (super.getBalance() < amount) {
			overdraft++;
			if (overdraft == 1 && (ChronoUnit.DAYS.between(lastWithDrawDate, dateOperation) < 30)) {
				super.withDraw(WITHDRAWAL_FEE_EXTRA);
				System.out.println("prelievi fuori disponibilita " + overdraft);
			} else if (overdraft > 1  && (ChronoUnit.DAYS.between(lastWithDrawDate, dateOperation) < 30)) {
				super.withDraw(WITHDRAWAL_FEE_EXTRA_MONTH);
				System.out.println("prelievi fuori disponibilita " + overdraft);
			}
		}
		
		withdrawals++;
		if (withdrawals > FREE_WITHDRAWALS){
		      super.withDraw(WITHDRAWAL_FEE);  
		   }
		super.withDraw(amount);
		lastWithDrawDate = dateOperation;
	}
	
	public void monthEnd(){
	   withdrawals = 0;
	}
	
}

