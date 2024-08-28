package com.edu.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.sqlite.SQLiteDataSource;
import org.sqlite.SQLiteJDBCLoader;

public class HankerRank18 {
	
	public static class User{
		String name;
		String email;
		
		public User(String name, String mail){
			this.name = name;
			this.email = mail;
		}
		public String getName() {
			return this.name;			
		}
		
		public String getEmail() {
			return this.email;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
	}
	
	public static void main(String[] args) throws IOException {		
		ArrayList<User> credentials = new ArrayList<>();
		String input = null; 
		int t = 0;
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        input = bufferedReader.readLine();
        t = Integer.parseInt(input);		
		Scanner scanner = new Scanner(System.in);		
		
		for(int i=0; i<t; i++) {			
			String str = scanner.nextLine();
			String[] creds = str.split(" ");
			String name = creds[0];
			String email = creds[1];
			User e = new User(name, email);
			credentials.add(e);			
		}			
		
		String myRegExString = "[a-zA-Z0-9]+@gmail.com";
		Pattern p = Pattern.compile(myRegExString);
		for(User u:credentials) {			
			Matcher m = p.matcher(u.email);
			if( m.find() ) {
			    // Print the match
			    System.out.println(u.getName()  );
			}
		}		
	}
}
