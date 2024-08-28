package com.edu.java;
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);	
		testScores = scores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	char calculate() {
		char average_vote = 0;
		int sum=0, average = 0;
		
		for(int i=0; i<this.testScores.length; i++)
			sum += testScores[i];
		
		average = sum / this.testScores.length;
		
		if (average <=100 && average >= 90) {
			average_vote = 'O';
		} else if (average < 90 && average >= 80) {
					average_vote = 'E';				
		} else if (average < 80 && average >= 70) {
					average_vote = 'A';
		} else if (average < 70 && average >= 55) {
					average_vote = 'P';
		} else if (average < 55 && average >= 40) {
					average_vote = 'D';
		} else if (average < 40) {
					average_vote = 'T';
		}
		
		return average_vote;
	}
}

class HackerRank8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}