package com.edu.java;

import java.util.*;

public class ContactComparingByName implements Comparator<Contatto> {
    public int compare(Contatto c1, Contatto c2){
        return c1.getNome().compareTo(c2.getNome());
    }

}
