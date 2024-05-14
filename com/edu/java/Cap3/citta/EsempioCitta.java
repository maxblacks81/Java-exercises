package citta;
import java.util.*;


public class EsempioCitta {

	public static void main(String[] args) {
		Persona p = new Persona("Max");
		Studente s = new Studente("Jim");
		Studente t = new Studente();
		
		p.print(); System.out.println(" \n");
		s.print(); System.out.println(" \n");
		
		p = s;
		p.print(); System.out.println(" \n");
		
		if (p.equals(s)) {
			System.out.print("p uguale a s" + '\n');
		}else {
			System.out.print("p non uguale a s" + '\n');
		}
	}

}
