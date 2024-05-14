package com.edu.java;

public class ArrayMethods {
	private int[] values;
	
	public ArrayMethods(int[] initialValues) {
		values = initialValues;
	}
	
	public void swapFirstAndLast() {
		int tmp = values[0];
		values[0] = values[values.length-1];
		values[values.length-1] = tmp;
	}
	
	public void shiftRight(int offset) {
		int[] temp = new int[this.values.length];
		
		
		for(int i=0; i<temp.length; i++) {
			temp[i] = 0;
		}		
		for(int i=0; i<values.length; i++) {			
			temp[i] = this.values[(i+offset)%this.values.length];
		}
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		
	}
	
	public void replaceWithZeroEvenMember() {
		for(int i=0; i<values.length; i++) {
			if (this.values[i]%2 == 0) {
				this.values[i] = 0;
			}
		}
	}
	
	public int getMax() {
		int largest = values[0];
		
		for(int i=0; i<values.length; i++) {
			if (values[i] > largest) {
				largest = values[i];
			}						
		}
		
		return largest;
	}
	
	public int getMin() {
		int  smallest = values[0];
		for(int i=0; i<values.length; i++) {
			if (values[i] > smallest) {
				smallest = values[i];
			}
			
			if (values[i] < smallest) {
				smallest = values[i];
			}
		}
		
		return smallest;
	}
	
	public void switchNextMax() {
		int temp = -1;
		
		for(int i=1; i<values.length-1; i++) {
			if (values[i-1] < values[i+1]) {
				temp = values[i];
				values[i] = values[i+1];
				values[i+1] = temp;
			} else if (values[i-1] > values[i]) {
				temp = values[i];
				values[i] = values[i-1];
				values[i-1] = temp;
			}
		}
	}
	
	
	public void toPrint() {
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
	}
}
