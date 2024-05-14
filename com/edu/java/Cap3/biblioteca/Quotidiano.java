package biblioteca;

public class Quotidiano extends Documento{
	String nome;
	double prezzo;
	
	public Quotidiano(String tipo, String n, double p) {
		super(tipo);
		nome = n;
		prezzo = p;		
	}
	
	public Quotidiano(int idx, String tipo, String n, double p) {
		super(tipo, idx);
		nome = n;
		prezzo = p;		
	}
	
	public String toString() {
		super.toString();
		return " Nome: " + nome + " Prezzo: " + prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
}
