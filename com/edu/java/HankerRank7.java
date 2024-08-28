package com.edu.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class HankerRank7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        int sum=0, sum_max=-1000;
        for(int i=0; i+2<6; i++) {
        	for(int j=0; j+2<6; j++) {        		
        		sum += arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + 
        				arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
        		System.out.print("Somma: " + sum);
        		if (sum>= sum_max)
        			sum_max = sum;
        		System.out.println(" Max: " + sum_max);
        		sum = 0;
        	}        	
        }
        System.out.println("Finale: " + sum_max);
    }
}
