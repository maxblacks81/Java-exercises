package com.edu.java;
import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    
    int power(int b, int e){        
        
    		
    	
    	
    	return 0;
    }
    
}
class HankerRank10{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
