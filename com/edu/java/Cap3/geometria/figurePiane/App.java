package geometria.figurePiane;

public class App {

	public static void main(String[] args) {
		
		
		Quadrato q = new Quadrato(2);
		
		Cerchio c = new Cerchio(3);
		
		System.out.println("Area Quadrato Prima: " + q.calcolaArea());
		q.raddoppiaLato(2);
		System.out.println("Area Quadrato Dopo: " + q.calcolaArea());
		
		System.out.println("Area Cerchio: " + c.calcolaArea());
		
		
		
	}

}
