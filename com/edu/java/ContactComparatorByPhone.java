package com.edu.java;

import java.util.*;

public class ContactComparatorByPhone implements Comparator<Contatto> {
	public int compare(Contatto c1, Contatto c2){
        return c1.getTelefono().compareTo(c2.getTelefono());
    }
}
