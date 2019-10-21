package net.ukr.shonen;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[] { 0, 5, 2, 4, 7, 1, 3, 19 };
		int b = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 != 0) {
				b++;
			}
		}
		System.out.println(b);
	}

}
