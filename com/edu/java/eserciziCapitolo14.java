package com.edu.java;

import java.util.LinkedList;
import java.util.ListIterator;

public class eserciziCapitolo14 {

	
	
	public static void downsize(LinkedList<String> employeeNames, int n) {
		
		ListIterator<String> iterator = employeeNames.listIterator();
		int i = 1;
		int empTotal = employeeNames.size();
		while(iterator.hasNext() && i<empTotal) {
			if (i % n == 0) {
				System.out.println(i + " " + iterator.next() + " ");
				iterator.remove();
			}
			i++;
			
			
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> employees = new LinkedList<>();	
		
		employees.add("Gianni");
		employees.add("Romeo");
		employees.add("Luca");
		employees.add("Guido");
		employees.add("Max");
		
		System.out.println("Prima");
		
		for(String s: employees) {
			System.out.println(s);
		}
		
		downsize(employees, 2);
		
		System.out.println("Dopo");
		
		for(String s: employees) {
			System.out.println(s);
		}
	}

}
