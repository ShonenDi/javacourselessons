package net.ukr.shonen;

import java.util.Scanner;

public class Trigon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.85;
		double b = 2.14;
		double c = 1.75;

		double p = 0.5 * (a + b + c);
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Площадь треугольника " + s + " см2");

	}

}
