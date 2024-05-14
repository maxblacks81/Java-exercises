package com.edu.java.cap9;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class EsempioCapitolo9 {

	public static void main(String[] args) {
//		
//		LocalTime now = LocalTime.now();
//		Employee e1 = new Employee("Mario Rossi", 1500.00);
//		Employee e2 = new Manager("Luigi Maio", 2000.00, 500);
//		Manager m1 = new Manager("Marco Rossini", 2000, 500);
//		m1.setBaseSalary(4000);
//		BasicAccount basic1 = new BasicAccount();
//		BankAccount basic2 = new CheckingAccount();
//		
//		Person p1 = new Person("Max", 1981);
//		Instructor p2 = new Instructor("Luca", 1990, 2000.00);
//		Person p3 = new Student("Marc", 2001, "Lettere");
//		Student s1 = new Student("Nik", 2002, "Geografia");
//		
//		
//		System.out.println(e1.toString());
//		System.out.println(e2.toString());
//		System.out.println(m1.toString());
//		
//		System.out.println("Current date " + now);
//		System.out.println("\n\n\n");
//		System.out.println(basic1.toString() + "\n");
//		
//		basic2.toString();
//		basic2.deposit(1000.00);
//		System.out.println(basic2.getBalance());
//		basic2.deposit(1000.00);
//		System.out.println(basic2.getBalance());
//		
//		basic2.withDraw(300.0);
//		System.out.println(basic2.getBalance());
//		basic2.withDraw(3000.00);
//		System.out.println(basic2.getBalance());
//		basic2.withDraw(3000.00);
//		
//		System.out.println(basic2.getBalance());
//		
//		System.out.println(p1.toString() + "\n");
//		System.out.println(p2.toString() + "\n");
//		System.out.println(p3.toString() + "\n");
//		System.out.println(s1.toString() + "\n");
		
		BetterRectangle br = new BetterRectangle(1,1,5,4);
		System.out.println("Area del Rettangolo: " + br.getArea());
		System.out.println("Perimetro del Rettangolo: " + br.getPerimeter());
		
	}

}
