package citta;

public class Persona {
	protected String nome;
	protected int anni;
	
	public Persona() {
		nome = "Sconosciuto";
		anni = 0;
	}
	public Persona(String s) {
		nome = s;
		anni = 0;
	}
	public Persona(String s, int n) {
		nome = s;
		anni = n;
	}
	public void print() {
		System.out.print("Mi chiamo " + nome);
		System.out.print(" e ho anni " + anni);
	}
	
}
