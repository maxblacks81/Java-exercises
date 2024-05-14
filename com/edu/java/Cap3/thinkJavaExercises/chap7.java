package thinkJavaExercises;


public class chap7 {
	
	static double power(double base, int exp) {
		double ris = 0, b = base;
		
			
			for (int i=exp; i>1; i--) {
				ris = b * base;
				b = ris;
				
			}
		return ris;
	}
	
	public static int factorial(int n) {
		
		if (n == 0) {
			return 1;
		}
			int recurse = factorial(n - 1);
			int result = n * recurse;
		return result;
	}
	
	public static double myexp(int x, int n) {
		double ris = 0;
		
		for (int i=0; i<n; i++) {
			ris += ((power(x, i)) / (factorial(i)));
		}
		
		return ris;
	}
	
	public static double myexp2(int x, int n) {
		double ris = 0;
		for (int i=0; i<n; i++) {
			System.out.println(i + " " + Math.pow(x, 1));
			System.out.println(i + " " + factorial(i));
			ris += (Math.pow(x, i)) / factorial(i);
			System.out.println(i + " " + ris);
			System.out.println();
		}
		return ris;
	}
	
	public static void main(String[] args) {
		//System.out.println(power(2.0, 8));
		//System.out.println(myexp(2,20));
		//System.out.println(factorial(5));
		//System.out.println(Math.exp(2));
		System.out.print(myexp2(2,5));
		
		
		
		

		
	}

}
