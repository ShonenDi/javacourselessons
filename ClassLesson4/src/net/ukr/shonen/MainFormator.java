package net.ukr.shonen;

public class MainFormator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		System.out.println(doubleToString(Math.PI, 11));

	}
	
	public static String doubleToString(double number, int n) {
		String result = String.format("%."+ n + "f", number);
		
		return result;
		
				
	}

}
