package com.edu.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HankerRank5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> phonebook = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("Acquisisci " + n + "contatti");
		
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name, phone);
        }
        
 
        Set<String> keySet = phonebook.keySet();        
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Integer phone = phonebook.get(s);
            System.out.print(s + "=" + phone);    
        }
        in.close();
    }
}
