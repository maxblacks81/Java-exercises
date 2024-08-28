package com.edu.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HankerRank16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int fixed_fine = 10000;
		int low_fine = 15;
		int mid_fine = 500;
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("[\\s,]+");
		
		int dd_rest = scanner.nextInt();
		int mm_rest = scanner.nextInt();
		int yyyy_rest = scanner.nextInt();
		
		scanner.useDelimiter("[\\s,]+");
		int dd_scadenza = scanner.nextInt();
		int mm_scadenza = scanner.nextInt();
		int yyyy_scadenza = scanner.nextInt();
		  
	    if((yyyy_rest <= yyyy_scadenza && mm_rest <= mm_scadenza && dd_rest <= dd_scadenza) || (yyyy_rest <= yyyy_scadenza && mm_rest >= mm_scadenza && dd_rest >= dd_scadenza))  {
	    			System.out.print(0);
	    } else {
	    		if (yyyy_rest == yyyy_scadenza &&
	    				mm_rest == mm_scadenza && 
	    						dd_rest > dd_scadenza) {
	    				System.out.println(low_fine * (dd_rest - dd_scadenza));
	    		} else {
	    			if (yyyy_rest == yyyy_scadenza  &&
	    					mm_rest > mm_scadenza) {
	    		    		System.out.println(mid_fine * (mm_rest - mm_scadenza));
	    			} else {
	    				if (yyyy_rest > yyyy_scadenza) {
	    					System.out.println(fixed_fine);
	    				}
	    			}
	    					
	    		}
	    }
	    
	}

}
