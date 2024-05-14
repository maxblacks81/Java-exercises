package com.edu.java.cap8;

import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawLetters extends JPanel{
	


	private static final long serialVersionUID = 1L;

	// draws an X from the corners of the panel
	public void paintComponent(Graphics g)
	{
		// call paintComponent to ensure the panel displays correctly
		super.paintComponent(g);
	
		// Draw letter L
		g.drawLine(10, 10, 10, 100);
		g.drawLine(10, 100, 50, 100);
				
		// Draw Letter H
		g.drawLine(70, 10, 70, 100);
		g.drawLine(70, 50, 110, 50);
		g.drawLine(110, 10, 110, 100);
		
		// Draw Letter E
		g.drawLine(130, 10, 130, 100);
		g.drawLine(130, 10, 170, 10);
		g.drawLine(130, 50, 170, 50);
		g.drawLine(130, 100, 170, 100);
		
		
	}
	
	
	
}
