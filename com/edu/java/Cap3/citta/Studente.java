package citta;

public class Studente extends Persona {
	int matricola;
	
	public Studente() {
		super();
		matricola = 9999;
	}
	public Studente(String s) {
		super(s);
		matricola = 9999;
	}
	public Studente(String s, int n) {
		super(s,n);
		matricola = 9999;
	}
	public void print() {
		super.print();
		System.out.print(" Matricola " + matricola);
	}

}
