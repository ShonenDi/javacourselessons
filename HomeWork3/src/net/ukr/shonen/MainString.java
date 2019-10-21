package net.ukr.shonen;

import java.util.Scanner;

public class MainString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String s = sc.nextLine();
		System.out.println("Enter integer value 'a'");
		int a = sc.nextInt();
		System.out.println("Enter double value 'b'");
		double b = sc.nextDouble();
		sc.close();
		summ(a, b, s);
	}
/**
 * Return the concatenation of string and sum of integer and double variable.
 * @author Shonen
 * 
 * 
 * @param x The <code>int</code> value. First number.
 * @param y The <code>double</code> value. Second number.
 * @param f The <code>String</code>. Inputed string.
 * @param c The <code>double</code> sum value of x and y. 
 * @return Will output the concatenation of f and c.
 */
	public static String summ(int x, double y, String f) {
		double c = x + y;
		System.out.println(f + " " + c);
		return f;

	}
}
