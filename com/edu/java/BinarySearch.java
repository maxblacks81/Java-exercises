package com.edu.java;

import java.util.ArrayList;

public class BinarySearch {
	/**
    Finds a value in a range of a sorted array, using the binary
    search algorithm.
    @param a the array in which to search
    @param low the low index of the range
    @param high the high index of the range
    @param value the value to find
    @return the index at which the value occurs, or -1
    if it does not occur in the array
 */
 public static Contatto searchByName(ArrayList<Contatto> contatti, int low, int high, String value){  
	
    if (low <= high){
       int mid = (low + high) / 2;
       
       if (contatti.get(mid).getNome().equals(value)) {
    	   return contatti.get(mid);
       } else if (contatti.get(mid).getNome().compareTo(value) < 0) {
          return searchByName(contatti, mid + 1, high, value);
       } else {
    	  return searchByName(contatti, low, mid - 1, value);
       }         
    } else {
       return null;
    }
 }
 
 public static Contatto searchByPhone(ArrayList<Contatto> contatti, int low, int high, String value){  
		
	    if (low <= high){
	       int mid = (low + high) / 2;
	       
	       if (contatti.get(mid).getTelefono().equals(value)) {
	    	   return contatti.get(mid);
	       } else if (contatti.get(mid).getTelefono().compareTo(value) < 0) {
	          return searchByPhone(contatti, mid + 1, high, value);
	       } else {
	    	  return searchByPhone(contatti, low, mid - 1, value);
	       }         
	    } else {
	       return null;
	    }
	 }
	 
}
