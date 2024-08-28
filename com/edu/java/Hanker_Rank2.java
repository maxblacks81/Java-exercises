package com.edu.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result2 {

    /*
     * Complete the 'diagonalDifference' function below.
     * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    	int sum_diag_a = 0;
        int sum_diag_b = 0;
        int[][] matrix = new int[arr.size()][arr.size()];
        
        int i=0; int j;
        for(List<Integer> row: arr) {
        	j=0;
        	for(Integer col: row) {
        		matrix[i][j] = col;
        		j++;
        	}
        	i++;
        }
        
        //diag A
        for(i=0; i<arr.size(); i++) {
        	for(j=0; j<arr.size(); j++) {
        		if (i==j) {
        			sum_diag_a += matrix[i][j];
        		}
        	}
        }
        
        //diag B
        for(i=arr.size()-1; i>=0; i--) {
        	for(j=0; j<arr.size(); j++) {
        		if (i+j == arr.size()-1) {
        			sum_diag_b += matrix[i][j];
        		}
        	}
        }
        
        System.out.println("Diag A: "+ sum_diag_a + " Diag B: " + sum_diag_b);
        return Math.abs(sum_diag_a - sum_diag_b);   
    }
}

public class Hanker_Rank2 {
    public static void main(String[] args) throws IOException {
        
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(11); row1.add(2); row1.add(4); 
        
        List<Integer> row2 = new ArrayList<>();
        row2.add(4); row2.add(5); row2.add(6);
        
        List<Integer> row3 = new ArrayList<>();
        row3.add(10); row3.add(8); row3.add(-12);        
        
        arr.add(row3); arr.add(row2); arr.add(row1);
        
        
        for(List<Integer> row: arr) {
        	System.out.println(row);
        }
        
        int result2 = Result2.diagonalDifference(arr);
        System.out.println(result2);

   }
}
