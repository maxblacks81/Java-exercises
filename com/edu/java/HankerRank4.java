package com.edu.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HankerRank4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        List<String> list = new ArrayList<>();
        String s = "";
        for(int i=0; i<T; i++){
            s = scan.nextLine();
            list.add(s);
        }
                
        for(String riga: list) {
        	System.out.println("Letto: " + riga);
        }
        
        scan.close();
        
        for(String str: list){
           String even = ""; String odd = "";
            int strlen = str.length();
            
            for(int j=0; j<strlen; j++){
                if (j%2 == 0){
                    even += str.charAt(j);
                } else { 
                        odd += str.charAt(j); 
                    }
            }
            System.out.println(odd + "  " + even);           
        }               
    }
}


