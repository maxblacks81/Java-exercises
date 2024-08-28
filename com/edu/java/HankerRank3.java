package com.edu.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result3 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    	
    	double occurrences_positive=0;
    	double occurrences_negative=0;
    	double occurrences_zeros=0;
    	
    	for(Integer i: arr) {
    		if (i>0) {
    			occurrences_positive++;
    		} else if (i<0) {
    					occurrences_negative++;
    		} else { occurrences_zeros++; }
    	}
    	
    	System.out.printf("%6f\n", occurrences_positive/arr.size());
    	System.out.printf("%6f\n", occurrences_negative/arr.size());
    	System.out.printf("%6f\n", occurrences_zeros/arr.size());
    	return;

    }

}

public class HankerRank3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result3.plusMinus(arr);

        bufferedReader.close();
    }
}
