package net.ukr.shonen;

import java.util.Arrays;

public class MainMi {

	public static void main(String[] args) {
		String text = "Hello";
		String text1 = "World";
		char[] t = text.toCharArray();
		System.out.println(Arrays.toString(t));
		char l = text.charAt(0);
		System.out.println(l);
		System.out.println(text.equals(text1));
		int i = text.indexOf("ll");
		String subtext = text.substring(0, 3);
		System.out.println(i);

	}

}
