package com.edu.java;

import java.io.*;
import java.util.*;

class Nodo{
	
    Nodo left,right;
    int data;
    Nodo(int data){
        this.data=data;
        left=right=null;
    }
}

class HankerRank13{
	
	public static int[] livelli = new int[100];
	
	static void levelOrder(Nodo root){
		//Write your code here
		int maxlevel = 1;
		
		countNodes(root, 1, livelli);
		
		for(int i=0; i<livelli.length; i++) {
			if (livelli[i] > maxlevel) {
				maxlevel = livelli[i];
			}
		}
		
		for(int i=1; i<=maxlevel; i++) {
			for(int j=0; j<livelli.length; j++) {
				if (livelli[j] == i) {
					System.out.print(j+" ");
				}
			}
		}      
    }
	
	static int countNodes(Nodo root, int L, int[] levels) {
		int level = L;
		if (root == null) {
			return -1 ;			
		}

		levels[root.data] = level;
		
		level = countNodes(root.left, L + 1, levels);
		
		level = countNodes(root.right, L + 1, levels);
		
				
		return level;
	}

	public static Nodo insert(Nodo root,int data){
        if(root == null){
            return new Nodo(data);
        }
        else{
            Nodo cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            
            Nodo root = null;
            
            while(T-->0){
                int data = sc.nextInt();
                root = insert(root,data);
            }
            
            levelOrder(root);
//            countNodes(root, 1, livelli);
//            for(int i=0;  i<10; i++) {            
//            		System.out.println("pos: "  + i + " livello " + livelli[i]);
//            }
        }	
}