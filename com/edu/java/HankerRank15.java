package com.edu.java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HankerRank15 {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] elencoNumeri = new int[T];
        boolean prime = true;
        
        for(int i=0; i<T; i++)
            elencoNumeri[i] = sc.nextInt();
        
        System.out.println(T);
        
        for(int i:elencoNumeri) {
        	System.out.println(i);
        }
        
        for(int i=0; i<T; i++){
        	prime = true;
        	
        	if (elencoNumeri[i] == 1) {
                prime = false;
        	}
        	        	
            for(int j=2; j<elencoNumeri[i]-1; j++){
                if (elencoNumeri[i] %j ==0){
                    prime = false;
                    break;
                }                   
            }
            
            if(prime)
            	System.out.println("Prime");
            else
            	System.out.println("Not prime");
        }
    }
}



