package net.ukr.shonen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число n в промежутке 4 < n < 14");
		int n = sc.nextInt();
			if (4 < n && n < 16) {
		
			for (int i = n-1; i !=0; i--) {
				n*=i;
			}
			System.out.print(n);

		} else {
			System.out.println("„исло вне диапазона");
		}
		sc.close();

	}

}
