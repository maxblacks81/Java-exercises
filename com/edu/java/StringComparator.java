package com.edu.java;

import java.util.*;

public class StringComparator implements Comparator<String> {
	
	public int compare(String s1, String s2) {
		
		if (s1.length() < s2.length()) {
			return -1;
		} else if (s1.length() > s2.length()) {
			return 1;			
			} else if (s1.compareTo(s2) < 0) {
					return -1;
				} else if (s1.compareTo(s2)>0) {
						return 1;			
					}
					return 0;
		
	}

}
