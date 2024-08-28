package com.edu.java;

import java.util.LinkedList;
import java.util.ListIterator;

public class es14_2 {
	
	public static void reverse(LinkedList<String> strings) {
		LinkedList<String> new_strings = new LinkedList<>();
		String tmp = "";
		ListIterator<String> iterator_string = strings.listIterator();
		ListIterator<String> iterator_newstring = new_strings.listIterator();
				
		while(iterator_string.hasNext()) {
			new_strings.addFirst(iterator_string.next());
		}
		
		int i=0;
		while(iterator_string.hasNext() && iterator_newstring.hasNext()) {
			tmp = iterator_newstring.next();
			strings.set(i++, tmp);
		}
		
		i=0;
		for(String e: new_strings) {
			System.out.println(i +" "+ e);
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> lista = new LinkedList<>();
		
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		
		for(String s: lista) {
			System.out.println(s);
		}
		
		System.out.println();
		reverse(lista);
		
		
	}

}
