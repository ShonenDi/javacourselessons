package net.ukr.shonen;

import java.util.Formatter;

public class Main {

	public static void main(String[] args) {
		
	for (int i = 2; i < 12; i++) {
            Formatter fmt = new Formatter();
            System.out.println(fmt.format("%." + i + "f", Math.PI));
            fmt.close();
	}
	}

}