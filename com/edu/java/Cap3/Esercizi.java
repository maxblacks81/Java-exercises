package Esercizio3;

public class Esercizi {
	
	public static String iniziali(String nome, String cognome) {
		String res = "";
		res +=  nome.charAt(0) + "&" + cognome.charAt(0);
		return res;
	}
	
	public static String reverseString(String s) {
		String rev = "";		
		for (int i=s.length()-1; i>=0; i--)
			rev += s.charAt(i);		
		return rev;
	}
	
	public static int countOccurrences(String s, String patt) {
		int occ = 0;
		int index = -1;		
		int i = 0;
		String toWork = s;
		
		while((index + patt.length()) < (toWork.length() - 1)) {
			
			index = toWork.indexOf(patt);
			if (index >= 0) {				
				occ++;
				toWork = toWork.substring(index + 1);						
			}		
		}
		
		return occ;
	}
	

	public static void main(String[] args) {
		int occorrenze = 0;
		
		System.out.println(iniziali("Paolo", "Rossi"));
		
		System.out.println(reverseString("Pippo"));
				
		System.out.println(countOccurrences("Ho pescato una scarpa scassata","sca"));
		
		
	}

}
