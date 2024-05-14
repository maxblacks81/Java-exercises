package com.edu.java;

import java.util.Scanner;

import javax.naming.StringRefAddr;

import java.util.Random;
import java.lang.String;
import java.lang.Character;

public class EsempioCapitolo6 {
	public static void main(String[] args) {
		/*
		//ES 6.3
		int i;
		String t;
		Scanner s = new Scanner(System.in);
		System.out.println("Digita del testo: ");
		t = s.nextLine();
		System.out.println("Letto " + t);
		//a) 
		for(i=0; i<t.length(); i++) {
			
			char c = t.charAt(i);
					;		
			if (Character.isUpperCase(c)) {
				System.out.print(t.charAt(i));
			}
			
		}
		System.out.println();
		//b)
		for(i=1; i<t.length(); i++ ) {
			if (i%2 > 0) {
				System.out.print(t.charAt(i));
			}
		}
		System.out.println();
		//c)
		String wovels = "aeiouAEIOU"; int vocali = 0; String posVocali="";
		for(i=0; i<t.length(); i++) {
			if (wovels.indexOf(t.charAt(i))>=0) {
				System.out.print("_");
				vocali ++;
				posVocali += i + "_";
			} else {
				System.out.print(t.charAt(i));
			}
			
		}
		//)d
		System.out.println();
		System.out.println("vocali: " + vocali);
		System.out.println();
		//)e
		System.out.println(posVocali);
		
		
		//ES 6.5
		float num=0.0f, sum= 0.0f;
		float num_min=10000.0f, num_max=0.000001f;
		int valori=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Digita un numero decimale: ");
		num  = s.nextFloat();
		System.out.println("Letto " + num);
		boolean chiedi = true;
		
		while(chiedi) {
			sum += num;
			valori++;
			
			if(num < num_min) {
				num_min = num;
			}
			
			if (num > num_max) {
				num_max = num;
			}
			
			System.out.println("Digita un numero decimale (tranne 0 per uscire): ");
			num  = s.nextFloat();
			System.out.println("Letto " + num);
			if (num == 0) {
				chiedi = false;
			}
		}
		
		//a)
		System.out.println("Media dei valori: " + sum/valori);
		//b)
		System.out.println("Minimo: " + num_min);
		//c)
		System.out.println("Massimo: " + num_max);
		//d)
		System.out.println("differenza tra Massimo e Minimo: " + (num_max-num_min));
		
		
		//ES.6.7
		Random Generator = new Random();
		int i, j;		
		char x , y;
		
		String new_str = "";		
		System.out.print("Leggi stringa: ");
		Scanner s = new Scanner(System.in);	
		String str = s.nextLine();		
		System.out.println("Letta string " + str + " lunga " + str.length());
		
		for (int c=0; c<str.length(); c++) {
			i = Generator.nextInt(str.length());
			j = Generator.nextInt(str.length());
			
			System.out.println(c + ") " + i + " " + j);
			
			if ((i!=str.length()-1) && (j>i)) {
				x = str.charAt(i);
				y = str.charAt(j);
								
				if ((i==0) && (y==i+1)) {
					System.out.println("// i=0 && j=i+1");
					new_str = y + x + str.substring(i+1, str.length());
					System.out.println(new_str);
					
				}else if ((i>0) && (j==str.length()-1)) {
					System.out.println("//i>0 && y==ultima posizione");
					new_str = str.substring(0, i) + y + x;
					System.out.println(new_str);
					 
				} else if ((i>0) && (j==i+1)) {
					System.out.println("// i>0  && j=i+1");
					new_str = str.substring(0,i) + y + x + str.substring(j+1);
					System.out.println(new_str);
				
				} else if ((i==0) && (j==str.length()-1)) {
					System.out.println("//x==0 e y==ultima posizione");
					new_str = y + str.substring(i+1, j) + x;
					System.out.println(new_str);
							
				} else if ((i>0) && (j<str.length())) {
					System.out.println("//x > 0 e y < della fine e non adiacente a x");
					new_str = str.substring(0,i) + y + str.substring(i+1, j) + x + str.substring(j+1);
					System.out.println(new_str);
							
				} else if ((i==0) && (j<str.length())) {
					System.out.println("//x==0 e y a meta stringa");
					new_str = y + str.substring(i+1, j) + x + str.substring(j+1);
					System.out.println(new_str);
				}
					
			}
			
			
		}
		
		
		//ES 6.9
		char inizio, fine;
		System.out.println("Leggi stringa: "); 
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String new_str = "";
		System.out.println("Letta stringa " + str);
		
		int lenstr = str.length();
		for (int i=lenstr-1; i>=0; i--) {
			new_str += str.charAt(i);			
		}
		System.out.println(new_str);
		
		
		
		//6.11
		System.out.println("Leggi stringa: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Letta stringa " + str);
		
		int i, j, win;
		for (win=1; win<=str.length(); win++) {
			for(i=0; i+win<=str.length(); i++) {
				for(j=i; j<i+win; j++) {
					System.out.print(str.charAt(j));
				}
				System.out.println();
			}
			
		}
		*/
		//ES 6.13
		System.out.println("Leggi numero: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Letto numero " + num);
		System.out.println(1011%10);
		
		
		
	}
	
}
