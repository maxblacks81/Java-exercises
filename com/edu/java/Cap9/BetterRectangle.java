package com.edu.java.cap9;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
	
	
	public BetterRectangle(int x, int y, int w, int h) {
		super(x,y,w,h);
		super.setSize(w, h);
		super.setLocation(x, y);		
	}
	
	public int getArea() {
		return (super.width * super.height);
	}

	
	public double getPerimeter() {
		return 2*(super.height + super.width);
	}
}
