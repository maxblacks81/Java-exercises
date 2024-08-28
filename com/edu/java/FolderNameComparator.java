package com.edu.java;

import java.util.*;

public class FolderNameComparator implements Comparator<String>{
	/**
	 * Funzione che confronta i path di due cartelle  
	 * @param dir1 path cartella dir1
	 * @param dir2 path cartella dir2
	 * @return ritorna una valore positivo, negativo o nulla a seconda se i path sono ordinati numericamente
	 */
	public int compare(String dir1, String dir2) {
		
		String part1 = "";
		String part2 = "";
		
		
		int dir1size = dir1.length();
		int dir2size = dir2.length();
		
		char[] dir1CharArray = dir1.toCharArray();
		char[] dir2CharArray = dir2.toCharArray();
		
		int i = 0;
		
		//Isolamento della parte numerica del 1°path
		while(Character.isDigit(dir1CharArray[dir1size-1-i])) {
			part1 += dir1CharArray[dir1size-1-i];
			i++;
		}
				
		//Isolamento della parte numerica del 1°path
		i = 0;
		while(Character.isDigit(dir2CharArray[dir2size-1-i]) ) {
			part2 += dir2CharArray[dir2size-1-i];
			i++;
		}
		
		//Generazione delle reverse String
		String part1Rev = "";
		for(i=part1.length()-1;i>=0; i--) {
			part1Rev += part1.charAt(i);
		}
		
		String part2Rev = "";
		for(i=part2.length()-1; i>=0; i--) {
			part2Rev += part2.charAt(i);
		}
		
		//Confronto parti numeriche
		if (Integer.parseInt(part1Rev) < Integer.parseInt(part2Rev)) {
			return -1;
		} else if (Integer.parseInt(part1Rev) > Integer.parseInt(part2Rev))
				return 1;
		return 0;
	}

}
