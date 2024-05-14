package com.edu.java.cap9;

public class Data {
	
	/**
	 * Calcola le medie dei valori di oggetti generici
	 * @param objects array di object di tipo Measurable
     * @return il valore medio di misure generiche
	 * **/
	public static double average(Measurable[] objects) {
		double sum = 0;
		
		for(Measurable obj:  objects) {
			sum += obj.getMeasure();
		}
		if (objects.length > 0) {
			return sum / objects.length;
		}
		return 0;
	}
	
	public static double getMax(Measurable[] objects) {
		double larger = 0;
		for(Measurable obj: objects) {
			if (larger < obj.getMeasure()) {
				larger = obj.getMeasure();
			}
		}
		return larger;
	}
	
	public static double getMin(Measurable[] objects) {
		double smaller = 10000;
		for(Measurable obj: objects) {
			if (smaller > obj.getMeasure()) {
				smaller = obj.getMeasure();
			}
		}
		return smaller;
	}
	
	public static Measurable getMaxObject(Measurable[] objects) {
		Measurable obj_max = null;
		double larger = 0;
		
		for(Measurable obj:objects) {
			if (obj.getMeasure() > larger) {
				larger = obj.getMeasure();
				obj_max = obj;
			}
		}
		return obj_max;
	}

}
