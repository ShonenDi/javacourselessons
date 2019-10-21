package net.ukr.shonen;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {

			if (i % 3 == 0) {
				System.out.println("Spam");
			} else if (i % 5 == 0) {
				System.out.println("Egg");
			}
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("Spam Egg");
			}
			if( i%5!=0 && i % 3 != 0 ) {
				System.out.println(i);
			}
		}
	}

}
