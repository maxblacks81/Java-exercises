package com.edu.java;


public class Geometry {
	
	public double getCubeVolume(double h) {
		return cubeVolume(h);
	}
	
	public static double cubeVolume(double h) {
		return (h*h*h);
	}
	
	public double getCubeSurface(double h) {
		return cubeSurface(h);
	}
	
	public static double cubeSurface(double h) {
		return h*h;
	}
	
	public double getShereVolume(double r) {
		return sphereVolume(r);
	}
	
	public static double sphereVolume(double r) {
		return (4/3)/(Math.PI)*Math.pow(r, 3);
	}
		
	public double getSphereSuSurface(double r) {
		return sphereSurface(r);
	}
	
	public static double sphereSurface(double r) {
		return 2*Math.PI*Math.pow(r,2);
	}
}
