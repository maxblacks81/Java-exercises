package com.edu.java;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class HankerRank9 {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node temp = new Node(data);
        Node currentNode = head;
        if (head == null) {
        	head = temp; 
        	return head;
        }
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = temp;
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}