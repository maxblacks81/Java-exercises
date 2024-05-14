package com.edu.java.cap3;

public class Forno {
	private int time;
	private int power;	
	private int state;
	
	public Forno() {
		state = 0;
		power = 0;
		time = 0;
	}
	
	public void setTime(int time) {
		this.time = time;		
	}
	
	public void setPower(int power) {
		this.power = power;		
	}

	public int getTime() {
		return time;
	}

	public int getPower() {
		return power;
	}	
	
	public void start() {
		state = 1;
		System.out.println("Cooking for " + 60 * getTime() + " seconds at level " + getPower());		
	}
	
	public void reset() {
		state = 0;
		power = 0;
		time = 0;
	}
	
}
