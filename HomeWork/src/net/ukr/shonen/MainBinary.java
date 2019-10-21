package net.ukr.shonen;

import java.util.Formatter;
import java.util.Scanner;

public class MainBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number");
		String binary = sc.nextLine();
		sc.close();
		Formatter fr = new Formatter();
		long bin = Long.parseLong(binary,2);
		fr.format("%c" + binary + "%c -> %d", '"', '"', bin );
		System.out.println(fr);

	}

}
