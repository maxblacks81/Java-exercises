package com.edu.java.cap8;

import java.io.IOException;
import java.util.Scanner;
//import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import javax.swing.JOptionPane;

import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
public class EserciziCapitolo8 {
	
	
	public static void main(String[] args) throws IOException {
//		Reader r = new Reader();
//		while(r.hasMoreElements()) {									
//			r.next();
//			System.out.println(r.getCurrent());
//		}
		
//		BankAccount b = new BankAccount();
//		System.out.println("Saldo: " + b.getBalance());
//		b.deposit(200.00);
//		b.deposit(300.00);
//		System.out.println("Saldo: " + b.getBalance());
//		
//		BankAccount newb;
//		newb = b.depositImmutable(2000);
//		System.out.println(newb.getBalance());
//		
//		BankAccount newnewb;
//		newnewb = newb.withDrawImmutable(1000);
//		System.out.println(newnewb.getBalance());
		
		
//		Geometry g = new Geometry();		
//		System.out.println("Area del cerchio " + g.getSphereSuSurface(1.0));
//		Students studenti = new Students();
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Vuoi registrare studenti?");
//		while((s.next().equals("S"))) {
//			studenti.registraStudente();
//			System.out.println("Vuoi registrare studenti?");
//		}
//		
//		studenti.mostraElencoStudenti();
//		System.out.println("Vuoi registrare i voti di studenti?");
//		while((s.next().equals("S"))) {
//			studenti.registraVoti();;
//			System.out.println("Vuoi registrare studenti?");
//		}
//		****************************************************		
//		DrawLetters d = new DrawLetters();
//		
//		JFrame application = new JFrame();
//		
//		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		application.add(d);
//		application.pack();
//		application.setSize(500, 500);
//		application.setVisible(true);
//		
//		
//		Point2D.Double p1 = new Point2D.Double();
//		p1.x= (int)(0.0); p1.y = (int)0.0;
//		
//		Point2D.Double p2 = new Point2D.Double();
//		p2.x = (int)(10.0); p2.y = (int)10.0;
//		
//		Graphics2D g2d = null;
//		
//		g2d.drawLine(0,0,1,1);
//		g2d.draw(null);
//		
//		JOptionPane.showMessageDialog(null, g2d);
	
		
		// create a panel that contains our drawing
//		DrawLetters panel = new DrawLetters();
//		// create a new frame to hold the panel
//		JFrame application = new JFrame();
//		// set the frame to exit when it is closed
//		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		application.add(panel); // add the panel to the frame
//		application.setSize(250, 250); // set the size of the frame
//		application.setVisible(true); // make the frame visible
//		
//		****************************************************
//		
//		int scelta;
//		LoginForm login = new LoginForm("Max","Blacks");
//		String username, password;
//		Scanner s = new Scanner(System.in);
//		
//		System.out.println("Digita Username: ");
//		username = s.nextLine();
//		System.out.println("Digita password: ");
//		password = s.nextLine();
//		
//		login.input(username+","+password);
//		
//		System.out.println("\n\tPremi:");
//		System.out.println("\n 1 - Submit \t 2 - Reset");
//		scelta = s.nextInt();
//		
//		if (scelta == 1) {
//			login.click("Submit");
//			if (login.loggedIn()) {
//				System.out.println("Autenticazione con successo");
//			} else {
//				System.out.println("Username o password errati ");
//			}
//		} else if (scelta == 2){
//			login.click("Reset");			
//		}
//				
//		****************************************************
		Point2D.Double p = new Point2D.Double();
		p.x = 0.0; p.y = 0.0;
		JFrame application = new JFrame();
		
		Drawline line = new Drawline(p);
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(line);
		application.setSize(250, 250);
		application.setVisible(true);
		
	}
	
	
	
}
