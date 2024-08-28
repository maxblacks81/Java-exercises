package com.edu.java;

import java.util.*;
import java.io.*;

class Node_{	
	Node_ left,right;
    int data; int height;
    
    Node_(int data){
        this.data = data;
        left = right = null;
        height = 0;
    }
}


class HankerRank12{
	
	public static int getHeight(Node_ root){
      //Write your code here
		
		int u, v;
		if (root == null) {
			return -1;
		}
		
		u = getHeight(root.left);
		v = getHeight(root.right);
		if (u > v) {
			return u+1;
		} else {
			return v+1;
		}
    }

	public static Node_ insert(Node_ root,int data){
        if(root==null){
            return new Node_(data);
        }
        else{
        	Node_ cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            
            Node_ root = null;
            
            while(T-->0){
                int data = sc.nextInt();
                root = insert(root,data);
            }
            
            int height = getHeight(root);
            System.out.println(height);
        }	
}