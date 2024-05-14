package biblioteca;

public abstract class Documento {
	protected String tipo;
	protected int id;
	
	public Documento() {
		id = 0;
		tipo = "generico";
	}
	
	public Documento(String d) {
		tipo = d;
	}
	
	public Documento(String d, int idx) {
		tipo = d;
		id = idx;
	}
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getId() {
		return id;
	}
	
	public int setId(int id) {
		return id;
	}
	
	public String toString() {
		return "\nDocumento: " + tipo;
	}
}
