package com.edu.java;
import java.lang.System.Logger.Level;
import java.util.Scanner;
import java.util.logging.*; 

public class EsempioCapitolo5 {

	public static void main(String[] args) {
		Logger logger 
        = Logger.getLogger( 
        		EsempioCapitolo5.class.getName()); 

		
		//logger.setLevel(Level.WARNING); 
		
		Paycheck p = new Paycheck(70, 10.0, "Neri", "NREMSM", "giugno 2024");
		Scanner s = new Scanner(System.in);
		String str;
		
		p.stampaRetribuzioneMensile();
		
		double n=2, radicequadrata;
		double eps = Math.pow(10, -25);
		
		radicequadrata = Math.sqrt(n*n);
		
		System.out.println("Radice quadrata di 2*2: " + radicequadrata);
		
		if (radicequadrata == 0) {
			System.out.println("Risultato uguale a 0");
		}else
			System.out.println("non è zero");
		
		System.out.println("epsilon" + eps);
		
		System.out.println(radicequadrata-2);
		
		if ( (Math.abs((radicequadrata-2)-0) < eps )){
			System.out.println("Risultato prossimo a zero");
		}
		
//		System.out.print("Acquisisci tre numeri: ");
//		str = s.nextLine();
//		
//		String part[] = str.split(" ");
//		System.out.println("Acquisiti : " + Integer.valueOf(part[0])+ "-" + Integer.valueOf(part[1]) + "-" + Integer.valueOf(part[2]));
//		
//		if ( (Integer.valueOf(part[0]) < Integer.valueOf(part[1])) && (Integer.valueOf(part[1]) < Integer.valueOf(part[2]))){
//			System.out.println("Increasing sequence");	
//			
//		} else 
//			if ( (Integer.valueOf(part[0]) > Integer.valueOf(part[1]) && (Integer.valueOf(part[1]) > Integer.valueOf(part[2])) )){
//					System.out.println("Decreasing sequence");
//				} 
//			else {
//				System.out.println("Mixed sequence");
//			}
		
//		System.out.print("Enter Card Notation :");
//		str = s.nextLine();
//		System.out.println("Checked " + str);
//		
//		Carta c = new Carta(str);
//		System.out.println(c.getDescription());
//		
//		float f1, f2;
//		System.out.println("Enter two floating point nums: ");
//		f1 = s.nextFloat();
//		f2 = s.nextFloat();
//		
//		System.out.println(Math.round(f1*1000)/1000);
//		System.out.println(Math.round(f2*1000)/1000);
//		
//		if (f1 == f2) {
//			System.out.println("equals");			
//		} else 
//			System.out.println("not equals");
		
		String alt;
		String temp, tempValue=null, scaleValue=null;
		System.out.println("Acquisisci temperatura: ");
		temp = s.nextLine();
		System.out.println("Acquisisci altitudine: ");
		alt = s.nextLine();
		
		if (temp.length() == 3) {
			tempValue = temp.substring(0,2);
			scaleValue = temp.substring(2, 3);
		}else if (temp.length() == 4) {
			tempValue = temp.substring(0,3);
			scaleValue = temp.substring(3, 4);
		} else {
			//Logger.getGlobal().info("errore di lettura valore di temperatura");
			System.out.println("Log Level = "
                    + logger.getLevel()); 
		}
		
		switch(scaleValue) {
			case "C":
				if (Integer.parseInt(tempValue)<=0) {
					System.out.println("A livello del mare con questa temp l'acqua è giacchiata");
				} else if (Integer.parseInt(tempValue)>0 && Integer.parseInt(tempValue)<100)
					System.out.println("A livello del mare con questa temp l'acqua è liquida");
					else
						System.out.println("A livello del mare con questa temp l'acqua è vapore	");
				break;
			case "F":
				
				if (((Integer.parseInt(tempValue) -32) * 5 / 9 )<=0) {
					System.out.println("A livello del mare con questa temp l'acqua è giacchiata");
				} else if (((Integer.parseInt(tempValue) -32) * 5 / 9 )>=0 && (32 - (Integer.parseInt(tempValue) * 5 / 9) ) <100)
					System.out.println("A livello del mare con questa temp l'acqua è liquida");
					else
						System.out.println("A livello del mare con questa temp l'acqua è vapore");
				break;
			default:
				System.out.println("Scala non valida");
				Logger.getGlobal().info("errore di battitura scala");
		}

		
		int punto_di_ebolizzione = (90 - Math.round(Integer.parseInt(alt) / 300)); 
		
		System.out.println(" a questa altitudine " + alt + " " + "il punto di ebolizione e': " + punto_di_ebolizzione); 
		
		
	}

}
