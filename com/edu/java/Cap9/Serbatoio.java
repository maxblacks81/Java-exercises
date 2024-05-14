
import java.util.*;

public class Serbatoio {
	private  int livello;
	
	public  void Rifornimento(int valore) {
		this.livello += valore;
	
	}
	
	public void Consumo(int valore) {
		this.livello -= valore;
	
	}
	
	public int getLivello() {
		return this.livello;
	}
	
	public Serbatoio (int valore) {
		livello = valore;
	}
	
	public static void main(String[] args) {
		
		Serbatoio s = new Serbatoio(5);
		
		System.out.println("Prima " + s.getLivello());
		
		s.Consumo(10);
		
		System.out.println("Prima " + s.getLivello());
		
		
		
			
	}

}
