package com.edu.java;
import java.io.IOException;


public class Reader {
	private String s;
	private int start = 0;
	private int current = 0;
	
	public Reader() throws IOException {
		char c; s = "";
		boolean devefinire = true;
		while(devefinire) {
			c = (char) System.in.read();
			if (c == '\n') {
				devefinire = false;
			}
			s += c;
		}
	}
	
	public void toprint() {
		System.out.println(s);
	}
	
	public boolean hasMoreElements() {
		if (start >= s.length())
			return false;
		
		return true;
	}
	
	public String getCurrent() {
		
		String temp = "";
		
		for(int i=current; i<start && i<s.length(); i++) {
			if (s.charAt(i) != ' ') {
				temp += s.charAt(i);
			}
			
		}
		current = start;
		return temp;
	}
	
	public void next() {
		boolean devotrovarespazio = true;
		
		while(devotrovarespazio) {
			if (start < s.length()) {
				if (s.charAt(start) == ' ' || s.charAt(start) == '\n') {
					devotrovarespazio = false;
				}
			}
			start++;
		}
	
	}
	
	public void next2() {
		
	
	}
}
