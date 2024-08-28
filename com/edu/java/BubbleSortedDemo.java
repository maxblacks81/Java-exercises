package com.edu.java;

import java.util.Scanner;

public class BubbleSortedDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    System.out.print("Enter array size: ");
	    int n = in.nextInt();
	    
		int[] a = ArrayUtil.randomIntArray(n, 100);
//		for(int e:a) {
//			System.out.println(e);
//		}
		
		boolean res = BubbleSorter.checkOrdered(a);
		System.out.println(res);
		System.out.println();
		
		BubbleSorter.sort(a);		
//		for(int e:a) {
//			System.out.println(e);
//		}
		
		res = BubbleSorter.checkOrdered(a);
		System.out.println(res);
	}

}
