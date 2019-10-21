package net.ukr.shonen;

import java.util.Scanner;

public class TextString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some words");
		String s = sc.nextLine();
		sc.close();
		howManyWords(s);
	}
/**
 * Count how many <code> int </code> words in your string
 * @author Shonen
 * 
 * @param w input your <code> string </code> from keyboard
 * @return <code> int </code> number words in your string
 */
	public static int howManyWords(String w) {
		int a = 0;
		String[] t = w.split("[ ]");
		for (int i = 0; i < t.length; i++) {
			a = i + 1;
		}
		System.out.println(a);
		return a;
	}
}
