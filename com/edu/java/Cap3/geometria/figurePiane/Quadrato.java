package geometria.figurePiane;

public class Quadrato {
	
	private float lato;

	
	public Quadrato(float valoreLato) {		
		this.lato = valoreLato;		
	}
	
	public float calcolaArea() {
		return (this.lato * this.lato);
	}
	
	public float raddoppiaLato(int moltiplicatore) {
		return (this.lato *= moltiplicatore);
	}

}
