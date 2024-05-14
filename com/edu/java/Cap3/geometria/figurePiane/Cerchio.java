package geometria.figurePiane;

public class Cerchio {
	
	private double raggio;
	
	public static final double  pigreco=3.14;
	
	public Cerchio(double valoreRaggio) {		
		this.raggio = valoreRaggio;		
	}
	
	public double calcolaArea() {
		
		return (raggio * raggio * Cerchio.pigreco);
	}
	
	

}
