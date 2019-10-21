package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Input a");
		a = sc.nextInt();

		int b;
		System.out.println("Input b");
		b = sc.nextInt();

		int c;
		System.out.println("Input c");
		c = sc.nextInt();

		int max;
		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		sc.close();

		System.out.println(max);

	}

}
