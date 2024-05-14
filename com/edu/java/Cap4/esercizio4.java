package esercizio4;
import java.util.*;
import java.util.Scanner;
public class esercizio4 {
	
	/*Scrivere un metodo stampaArray che stampi gli elementi 
	di un array di interi preso in input e poi vada a capo*/
	
	/**VARIABILI**/
	public static ArrayList<Integer> arr1 = new ArrayList<Integer>();	
	
	/**METODO STAMPA**/
	public static void stampaArray(String listaInteriDaStampare) {	
		String[] temp = listaInteriDaStampare.split(" ");
		
		for(int i=0; i<temp.length; i++) {
			arr1.add(Integer.parseInt(temp[i]));;
		}		
		for (int aNumber : arr1 ) { 
	        System.out.println("Arraylist contains:" + aNumber );
	    }			
	}
	
	/**METODO MEDIA**/
	public static double calcolaMedia(ArrayList<Integer> arr) {
		double somma = 0.0;
		
		for (int a : arr1) 
			somma += a;		
		
		return (somma / arr.size());
	}
	
	/**METODO FIBONACCI**/
	public static ArrayList<Integer> calcolaFibo(int n) {		
	
		ArrayList<Integer> numeri_fibonacci = new ArrayList<Integer>();
		
		if (n==0) {
			numeri_fibonacci.add(1);
			return numeri_fibonacci;
		} else {
		
			if (n==1){
				numeri_fibonacci.add(1);
				numeri_fibonacci.add(1);
				return numeri_fibonacci;
			}
		} if (n > 1) {
			numeri_fibonacci.add(1);
			numeri_fibonacci.add(1);			
			numeri_fibonacci.add(numeri_fibonacci.get(0) + numeri_fibonacci.get(1));
			for (int i=2; i<=n; i++) {				
				numeri_fibonacci.add(numeri_fibonacci.get(i-1) + numeri_fibonacci.get(i));
			}
		}
		return numeri_fibonacci;
	}
	
	public static void printPari(int[] v) {
		System.out.println("Numeri pari: ");
		for(int value : v) {
			if (value%2 == 0) {
				System.out.println(value + "\n");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] v = {1, 2, 3, 4};
		
		ArrayList<Integer> numeri_fibo = new ArrayList<Integer>();
		
		/**Acquisizione String**/
		String lista;
		Scanner string_s = new Scanner(System.in);
		System.out.print("Inserire la lista di numeri separati da spazio: ");
		lista = string_s.nextLine();
		
		
		// Stampa arrayList di interi
		stampaArray(lista);
		System.out.println("La media degli elementi è: " + calcolaMedia(arr1));
		
		// Stampa numeri di Fibonacci
		numeri_fibo = calcolaFibo(5);
		for (int f : numeri_fibo) {
			System.out.print(f + " ");
		}
		
		/*Scrivere un metodo findPari che, preso in input un array di interi v, restituisca un array con i soli numeri pari presenti in v*/
		printPari(v);
	}
	
	

}
