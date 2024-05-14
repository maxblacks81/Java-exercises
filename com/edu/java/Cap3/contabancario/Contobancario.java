package contabancario;

public class Contobancario {
	
	/*Attributi*/
	
	private double saldo;
	
	private String titolare;
	
	
	private String numero_conto;

	

	
	/** Costruttore
	 * 
	 * @param saldoInizialie
	 */
	
	public Contobancario(double saldoIniziale) {
		this.saldo = saldoIniziale;
	}
	
	/** Costruttore
	 * 
	 * @param saldo
	 * @param titolare
	 * @param num_conto
	 */
	
	public Contobancario(double saldo, String titolare, String num_conto) {
		this.titolare = titolare;
		this.numero_conto = num_conto;
		this.saldo = saldo;
	}
	
	public String getNumero_conto() {
		return numero_conto;
	}

	public void setNumero_conto(String numero_conto) {
		this.numero_conto = numero_conto;
	}

	
	public void versamento(double valore) {		
		if (valore > 0) {
			this.saldo += valore;		
			System.out.println("\nSaldo sul cc: " +
					this.getNumero_conto() + " " + this.getSaldo()
			);
			
		}else {
			System.out.println("\nValore immesso non valido");
			
		}		
		
	}
	
	public void prelievo(double valore) {
		double saldo_attuale = this.getSaldo();
		if (saldo_attuale >= valore) {
			this.saldo -= valore;
			System.out.println("\nSaldo sul cc: " +
					this.getNumero_conto() + " " + this.getSaldo()
			);
		}else {
			System.out.println("\nSaldo insufficiente");
		}		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}
	
	public static void trasferimento(Contobancario conto1, Contobancario conto2, double  valore) {
		System.out.println("Conto 1 saldo: " + conto1.getSaldo());
		System.out.println("Conto 2 saldo: " + conto2.getSaldo());
		
		
		conto1.prelievo(valore);
		conto2.versamento(valore);
		
		System.out.println("Conto 1 saldo: " + conto1.getSaldo());
		System.out.println("Conto 2 saldo: " + conto2.getSaldo());
		
	}
	
}
