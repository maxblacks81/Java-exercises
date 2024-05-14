package com.edu.java.cap8;


import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.geom.Point2D;

public class Drawline extends JPanel{
	private static final long serialVersionUID = 1L;
	private Point2D.Double a;
	
	
	public Drawline(Point2D.Double p) {
		a = p;
	}
	
	public void paintComponent(Graphics g2d) {
		super.paintComponent(g2d);
		
		
		g2d.drawLine(0,0,200,20);
		g2d.drawLine(0,0,180,40);
		g2d.drawLine(0,0,160,60);
		g2d.drawLine(0,0,140,80);
		g2d.drawLine(0,0,120,100);
		g2d.drawLine(0,0,100,120);
		g2d.drawLine(0,0,80,140);
		g2d.drawLine(0,0,60,160);
		g2d.drawLine(0,0,40,180);
		g2d.drawLine(0,0,20,190);
		
		g2d.drawLine(20,190,250,200);
		
		
	}
	
}
