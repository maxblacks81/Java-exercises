package biblioteca;

public class Compactdisk extends Documento{
	private String titolo;
	private String genere;
	
	public Compactdisk(String tipo, String t, String g) {
		super(tipo);
		titolo = t;
		genere = g;
	}
	
	public Compactdisk(int idx, String tipo, String t, String g) {
		super(tipo, idx);
		titolo = t;
		genere = g;
	}
	
	public String toString() {
		super.toString();
		return " Titolo: " + titolo + " Genere: " + genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public int getId() {
		return id;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	
	
}
