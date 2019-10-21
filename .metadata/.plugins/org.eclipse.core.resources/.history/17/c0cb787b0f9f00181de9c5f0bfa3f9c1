package net.ukr.shonen;

public class Methods {

	public static void main(String[] args) {

		int d = 5;
		int f = 15;
		int sum = calculatSum(3, 2) + calculatSum(1, 2, d);
//		System.out.println(sum);
		System.out.println(calculateFactorial(5));
		
//		drawTriangle(7, '$');
//		drawTriangle(13, '$');

	}
	/**
	 * Calculate sum two integer values and return
	 * @author Shonen
	 * 
	 * 
	 * @param a The <code>int</code> values. First number
	 * @param b The <code>int</code> values. Second number
	 * @return <code>int</code> sum First and Second nmbers
	 */

	public static int calculatSum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int calculatSum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;

	}

	public static void drawTriangle(int h, char sym) {
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(sym);
			}
			System.out.println();
		}
	}
	
	public static long calculateFactorial(long n) {
		if(n<=1) {
			return 1L;
		}else {
			return n*calculateFactorial(n-1);
		}
		
	}

}
