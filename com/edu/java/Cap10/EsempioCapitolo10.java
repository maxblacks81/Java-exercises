package com.edu.java.cap9;



public class EsempioCapitolo10 implements Sequence{
	
	int powerOf(int n) {
		return 10*n;
	}
	
	double multipleOf(int n) {
		return Math.abs((int)(Math.random() * Integer.MAX_VALUE)*n*2);
	}
	
	
	public static void main(String[] args) {
		
//		Measurable[] accounts = new Measurable[3];
//		
//		accounts[0] = new BankAccount(1000.00);
//		accounts[1] = new BankAccount(2000.00);
//		accounts[2] = new BankAccount(5000.00);
//				
//		System.out.println("Il conto corrente con più denaro ha €: " + Measurable.largest(accounts));
//		System.out.println("Il conto corrente con meno denaro ha €: " + Measurable.smallest(accounts));
//		
//		Measurable[] quiz = new Measurable[3];
//		
//		quiz[0] = new Quiz("A");
//		quiz[1] = new Quiz(2);
//		quiz[2] = new Quiz(1);
//		
//		double valore_massimo = Data.getMax(quiz);
//		double valore_minimo = Data.getMin(quiz);
//		double media = Data.average(quiz);
//		
//		System.out.println("La media dei punteggi nei quiz è :" + media);
//		System.out.println("Valore più alto dei punteggi nei quiz è :" + valore_massimo);
//		System.out.println("Valore più basso dei punteggi nei quiz è :" + valore_minimo);
		
//		Measurable[] persons = new Measurable[3];
//		
//		persons[0] = new Person("Max", 180);
//		persons[1] = new Person("Ann", 190);
//		persons[2] = new Person("Mic", 178);
//		
//		Measurable tallest; 
//		tallest = Data.getMaxObject(persons);
//		System.out.println("Uomo più alto: " + ((Person) tallest).getName());
//		System.out.println("Altezza media cm: " + Data.average(persons));
		
//		LastDigitDistribution d1 = new LastDigitDistribution();
//		d1.process(new RandomSequence(), 1000);
//		d1.display();

		
		LastDigitDistribution d1 = new LastDigitDistribution();
		EsempioCapitolo10 es10 = new EsempioCapitolo10();
//		System.out.println(es10.powerOf(2));
//		System.out.println(es10.multipleOf(3));
//		int[] vettore = new int[4];
//		vettore = es10.values(4);
//		for(int i:vettore) {
//			System.out.println(i);
//		}
		d1.process(new SquareSequence(),10);
		d1.display();
		
		
	}

}
