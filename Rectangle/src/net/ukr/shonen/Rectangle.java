package net.ukr.shonen;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of rectangle a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > 0 && b > 0) {
			for (int i = 1; i <= b; i++) {
				for (int j = 1; j <= a; j++) {
					if ((i == 1 || i == b) || (j == 1 || j == a)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}

		} else {
			System.out.println("sides like this dosn't exsist");
		}
		sc.close();

	}

}