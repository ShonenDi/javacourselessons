package net.ukr.shonen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEditor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text");

		try (PrintWriter pw = new PrintWriter("My Text.txt")) {

			String s = sc.nextLine();

			pw.println(s);

			pw.close();
			sc.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
