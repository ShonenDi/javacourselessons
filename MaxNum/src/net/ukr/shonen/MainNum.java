package net.ukr.shonen;

import java.util.Scanner;

public class MainNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number");
		double a = sc.nextDouble();
		System.out.println("Input second number");
		double b = sc.nextDouble();
		System.out.println("Input trid number");
		double c = sc.nextDouble();
		System.out.println("Input fourth number");
		double d = sc.nextDouble();

		double max;

		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}

		System.out.println("Max number = " + max);

	}

}
