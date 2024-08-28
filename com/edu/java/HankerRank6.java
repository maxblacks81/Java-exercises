package com.edu.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class HankerRank6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        String bin = ""; int val_10 = n; int quoziente, resto;
        
        quoziente = val_10 / 2;        
        while(val_10 > 0) {        
        	resto = val_10 % 2;        	
        	val_10 = quoziente;        	
        	bin += String.valueOf(resto);        	
        	quoziente = val_10 / 2;        
        }               
        
        int state = 0, consecutive = 0, consecutive_max = 0;
        
        for(int i=0; i<bin.length(); i++) {
        	if (bin.charAt(i) == '0') {
        		state = 0; consecutive = 0;
        	} else if (bin.charAt(i) == '1') {
        				state = 1; consecutive++;
        				if (consecutive >= consecutive_max) {
        					consecutive_max = consecutive;
        				}
        	}        	
        }
        
    }
}
