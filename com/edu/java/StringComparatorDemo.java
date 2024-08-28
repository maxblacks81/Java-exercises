package com.edu.java;

import java.util.*;
import java.util.Random;

public class StringComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> listOfString = new ArrayList<>();
		
		final Random generator = new Random();
		
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter number of String size: ");
	    int n = in.nextInt();
	    int lenMaxString;	    
	    
	    for(int i=0; i<n; i++) {	    	
	    	lenMaxString = generator.nextInt(6) + 1;
	    	listOfString.add(ArrayUtil.randomString(lenMaxString));
	    }
	    
	    System.out.print("----- List of Strings Unsorted \n");
	    
	    for(String s:listOfString) {
	    	System.out.println(s);
	    }
	    
	    System.out.print("\n----- List of Strings Sorted \n");
	    
	    Collections.sort(listOfString, new StringComparator());
	    
	    for(String s:listOfString) {
	    	System.out.println(s);
	    }
	}

}
