package com.edu.java;
import java.util.Random;
import java.util.Scanner;
public class EsempioCapitolo7 {

	public static void main(String[] args) {
		/*7.2
		Random generator = new Random();
		
		int[] nums = new int[10];
		
		for (int i=0; i<10; i++) {
			nums[i] = generator.nextInt(10);
		}
		
		System.out.println("numeri di indice pari");
		for (int i=0; i<10; i++) {
			if ((i%2) == 0) {
				System.out.println(nums[i]);
			}
		}
		
		System.out.println("numeri pari");
		for (int i=0; i<10; i++) {
			if (nums[i]%2 ==0) {
				System.out.println(nums[i]);
			}
		}
		
		System.out.println("numeri in ordine inverso");
		for (int i=9; i>=0; i--) {			
			System.out.println(nums[i]);
		}
		
		System.out.println("1°elemento: " + nums[0] + " Ultimo elemento: " + nums[9]);
		*/
		
		/*7.3 7.4 7.6
		Scanner v = new Scanner(System.in);
		final int lenght = 5;
		double[] values = new double[lenght];
		int currentsize = 0;
		
		System.out.println("Enter values or Press Q to quit");
		while(v.hasNextDouble() && currentsize < lenght) {
			values[currentsize++] = v.nextDouble();			
		}
		
		System.out.println("Letti: ");
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		
		double largest = values[0];
		double smallest = values[0];
		for(int i=0; i<currentsize; i++) {
			if (values[i] > largest) {
				largest = values[i];
			}
			
			if (values[i] < smallest) {
				smallest = values[i];
			}
		}
		System.out.println("Largest is: " + largest + " and Smallest is: " + smallest);
		
		double sum=0;
		for(int i=0; i<lenght; i++) {			
			if (values[i] < smallest) {
				smallest = values[i];
			}
			sum += values[i];			
		}
		System.out.println("Somma valori: " + sum + ", smallest: " + smallest + " difference= " + (sum-smallest));
		
		sum=values[0];
		System.out.print(values[0] + " - ");		
		for(int i=1; i<lenght; i++) {
			if ((i == lenght-1) && ((i%2) == 1)){
				sum -= values[i];
				System.out.print(values[i]);
			} else if ((i == lenght-1) && ((i%2) == 0)) {
				sum += values[i];
				System.out.print(values[i] + " = ");
			} else 	if((i%2) == 1) {
				sum -= values[i];
				System.out.print(values[i] + " + ");
			} else {
				sum += values[i];
				System.out.print(values[i] + " - ");
			}
		}
		System.out.println(sum);
		*/
		
		/*7.8
		Random generator = new Random();
		int i=0, j=0, currentsize=0, length=10, val;
		int[] values = new int[length];
		
		boolean ciclo, doppioneNonTrovato;
		
	
		while(currentsize < length) {
			ciclo = true; 			
			while(ciclo) {				
				val = generator.nextInt(10) + 1;
				doppioneNonTrovato=true;
				for(i=0; i<=currentsize && doppioneNonTrovato; i++) {
					if (values[i] == val) {
						doppioneNonTrovato = false;
					}
				}
				if (doppioneNonTrovato) {					
					values[currentsize++] = val;
					ciclo = false;
				}					
			}			
		}
		
		for(i=0; i<values.length; i++) {			
			System.out.print(values[i] + " ");
		}*/
		
		/*7.10
		
		Dataset d = new Dataset(10);
		
		d.add(10.0);
		d.add(10.5);
		d.add(10.1);
		d.add(10.94);
		d.add(10.32);
		d.add(10.11);
		d.add(10.02);d.add(10.84);d.add(10.81);d.add(10.66);d.add(10.51);
		
		System.out.println(d.getCountsize());
		System.out.println(d.getMax());
		*/
		
		/*7.10*/
		int v[] = {1,2,3,4};
		int lensquence = 5;
		ArrayMethods a = new ArrayMethods(v);
		Sequence s = new Sequence(lensquence-1);
		Sequence t = new Sequence(lensquence-1);
		//A - a.swapFirstAndLast();
		//B - a.shiftRight(2);
		//C - a.replaceWithZeroEvenMember();
		//D  -a.switchNextMax();
		
		s.set(0,1);
		s.set(1,2);
		s.set(2,3);
		s.set(3,4);
		
		
		t.set(0,1);
		t.set(1,2);
		t.set(2,3);
		t.set(3,4);
		
		System.out.println(s.sameValues(t));
		System.out.println(s.equals(t));
		
		
		
	} 
}
