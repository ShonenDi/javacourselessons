package net.ukr.shonen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (PrintWriter a = new PrintWriter("c.txt")) {
			for (int i = 0; i < 10; i++) {
				a.println(i);
			}
			a.println();
			a.println("Hello WORLD");
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FILE WRITE");
		}
	}
}
