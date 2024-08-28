package com.edu.java;

import java.util.Arrays;

public class ContactSorter {
	public static void sortContactsByName(Contatto[] contatti){
        Arrays.sort(contatti, new ContactComparingByName());
    }
	
	public static void sortContactsByPhone(Contatto[] contatti){
        Arrays.sort(contatti, new ContactComparatorByPhone());
    }
	
}
