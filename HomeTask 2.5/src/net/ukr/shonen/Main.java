package net.ukr.shonen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество полос");
		int h = 5;
		int a = sc.nextInt();
		for ( int i =1; i<=h; i++) {
			for (int j = 1;j<=a; j++) {
				if (j%2!=0) {
					System.out.print("***");
				}else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
		sc.close();

		
	}
}
