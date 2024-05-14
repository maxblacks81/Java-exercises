package biblioteca;

public class Dizionario extends Documento{
	String nome;
	String lingua;
	
	public Dizionario(String tipo, String n, String l) {
		super(tipo);
		nome = n;
		lingua = l;
	}
	
	public Dizionario(int idx, String tipo, String n, String l) {
		super(tipo, idx);
		nome = n;
		lingua = l;
	}
	
	public String toString() {
		super.toString();
		return " Nome: " + nome + " Lingua: " + lingua;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}

	public String getLingua() {
		return lingua;
	}

	public void setLingua(String lingua) {
		this.lingua = lingua;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
