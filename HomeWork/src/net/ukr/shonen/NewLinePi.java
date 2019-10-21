package net.ukr.shonen;

import java.util.Formatter;

public class NewLinePi {

	public static void main(String[] args) {
		for (int i = 2; i < 12; i++) {
			Formatter fr = new Formatter();
			System.out.println(fr.format("%." + i + "f", Math.PI));
			fr.close();
		}
	}

}
