package net.ukr.shonen;

import java.util.Arrays;
import java.util.Scanner;

public class MyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text");
		String a = sc.nextLine();
		char[] t = a.toCharArray();
		int b = 0;
		for (int i : t) {
			if (i == 'b') {
				b++;
			}

		}
		System.out.println(Arrays.toString(t));
		System.out.println("There is " + b + " 'b' in your string");
		sc.close();
	}

}
