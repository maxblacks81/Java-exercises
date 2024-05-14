package biblioteca;

public class Libro extends Documento{
	
	String titolo;
	int pagine;
	double prezzo;
	
	public Libro(String tipo, String t, int p, double pr) {
		super(tipo);
		titolo = t;
		pagine = p;
		prezzo = pr;
	}
	
	public Libro(int idx, String tipo, String t, int p, double pr) {
		super(tipo, idx);
		titolo = t;
		pagine = p;
		prezzo = pr;
	}
	
	public String toString() {
		super.toString();
		
		return " Titolo: " + titolo + " Nr° di pagine: " + pagine + " Prezzo: " + prezzo;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
}
