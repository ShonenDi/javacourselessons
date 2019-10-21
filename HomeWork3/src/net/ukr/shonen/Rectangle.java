package net.ukr.shonen;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle height");
		int a = sc.nextInt();
		System.out.println("Enter rectangle width");
		int b = sc.nextInt();
		sc.close();
		drawRectangle(a, b);

	}

	/**
	 * This is method nothing return, just drawing the rectangle with char *
	 * 
	 * @author Shonen
	 * 
	 * @param x The <code>int</code> value height of rectangle
	 * @param y The <code>int</code> value width of rectangle
	 */
	public static void drawRectangle(int x, int y) {
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		if (x <= 0 && y <= 0) {
			System.out.println("You are wrong!!!");
		}
	}

}
