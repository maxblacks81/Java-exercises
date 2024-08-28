package com.edu.java;

import java.io.*;
import java.util.*;

class Mynode{
	int data;
	Mynode next;

	Mynode(int d){
        data = d;
        next = null;
    }
	
}

class HankerRank14{

    public static Mynode removeDuplicates(Mynode head) {
      //Write your code here
    	
    	Mynode start = head;
    	
    	while(start != null) {
    		if (start.next!=null && start.data == start.next.data) {
    			Mynode duplicate = start.next;
    			while(duplicate != null && duplicate.next !=null && duplicate.data == duplicate.next.data) {
    				duplicate = duplicate.next;
    			}    			
    			start.next = duplicate.next;    			
    		}
    		start = start.next;
    	}    	
    	    	
    	return head;
    	
    }

    public static  Mynode insert(Mynode head,int data){
    	
    	Mynode p = new Mynode(data);			
    	    	
        if(head == null)	//1st node        	
            head = p;
        else if(head.next == null) //1st node after head
            head.next=p;
        else {        	
	        	Mynode start = head; //any  next node after the second 
	            while(start.next != null) {
	            	start = start.next;
	            }	            	
	           start.next = p;
	            
        }
        return head;
        
    }
    public static void display(Mynode head){
    	
    	Mynode start=head;
        
    	while(start != null){
    		System.out.print(start.data+" ");
            start = start.next;
        }
    	
    }
    
    public static void main(String args[]){
    
    	Scanner sc = new Scanner(System.in);              
    	Mynode head = null;
                           
    	int T = sc.nextInt();              
    	//System.out.println("Letto " + T);
    	
    	while(T-->0){
    		//System.out.println(T);
    		int ele = sc.nextInt();                  
    		head = insert(head,ele);             
    	}
        
    	System.out.println("Lista con duplicati: ");
    	display(head);
    	System.out.println("\nLista senza duplicati: ");
    	head = removeDuplicates(head);                            
    	display(head);

       }
    }