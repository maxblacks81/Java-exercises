package contabancario;

public class App {
	
	
	
	public static void main(String[] args) {
		
		Contobancario c1 = new Contobancario(40.00);
		c1.setTitolare("Neri");
		c1.setNumero_conto("C100");
		
		Contobancario c2 = new Contobancario(140.00);
		c1.setTitolare("Bianchi");
		c1.setNumero_conto("C101");
		
		
		Contobancario.trasferimento(c1, c2, 300.00);

	}

}
