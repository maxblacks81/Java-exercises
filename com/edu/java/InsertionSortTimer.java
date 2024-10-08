package com.edu.java;

import java.util.Scanner;

public class InsertionSortTimer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter array size: ");
	    int n = in.nextInt();

	      // Construct random array
	   
	    int[] a = ArrayUtil.randomIntArray(n, 100);
	      
	      // Use stopwatch to time selection sort
	      
	    StopWatch timer = new StopWatch();
	      
	    timer.start();
	    BubbleSorter.sort(a);
	    System.out.println("Running sort");
	    timer.stop();
	      
	    System.out.println("Elapsed time: " 
	            + timer.getElapsedTime() + " milliseconds");
	    in.close();
	}

}
