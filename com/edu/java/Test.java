package com.edu.java;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.sqlite.SQLiteDataSource;
import org.sqlite.SQLiteJDBCLoader;
import java.sql.*;

//public class Test {
//	public static final boolean Connected() throws Exception {
//		boolean initialize = SQLiteJDBCLoader.initialize();
//
//        SQLiteDataSource dataSource = new SQLiteDataSource();
//        dataSource.setUrl("jdbc:sqlite:/home/users.sqlite");
//        int i=0;
//        try {
//        	ResultSet executeQuery = dataSource.getConnection().createStatement().executeQuery("select * from \"Table\"");
//            while (executeQuery.next()) {
//            	i++;
//                System.out.println("out: "+executeQuery.getMetaData().getColumnLabel(i));
//            }
//
//        } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, ex);
//        }
//
//        return initialize;
//
//	}
//}


public class Test {  
	
	  public static void main( String args[] ) {
	      Connection c = null;
	      Statement statement = null;
	      try {
	         Class.forName("org.sqlite.JDBC");
	         c = DriverManager.getConnection("jdbc:sqlite:/home/maggioli/Max/Dev/Java/DB/Credentials");
	         c.setAutoCommit(false);
	         statement = c.createStatement();
	         ResultSet rs = statement.executeQuery("SELECT * FROM Users");
	         while(rs.next()) {
	        	 System.out.println(rs);
	         }
	      } catch ( Exception e ) {
	         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	      
	      
	   }
	  
	  
	}

