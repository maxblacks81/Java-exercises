package com.edu.java.cap9;

public interface Measurable {
	
	double getMeasure();
	
	public static double average(Measurable[] objects) {
		double sum = 0;
		
		for (Measurable obj: objects) {
			sum += obj.getMeasure();
		}
		if (objects.length > 0) {
			return sum/objects.length;
		} else {
			return 0;
		}
//	}
//	
//	public static double largest(Measurable[] objects) {
//		double larger = 0;
//		for(Measurable obj: objects) {
//			if (larger < obj.getMeasure()) {
//				larger = obj.getMeasure();
//			}
//		}
//		return larger;
//	}
//	
//	public static double smallest(Measurable[] objects) {
//		double smaller = 10000;
//		for(Measurable obj: objects) {
//			if (smaller > obj.getMeasure()) {
//				smaller = obj.getMeasure();
//			}
//		}
//		return smaller;
	}
	
	
	
}
