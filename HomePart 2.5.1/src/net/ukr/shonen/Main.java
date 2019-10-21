package net.ukr.shonen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите количество полос");
		int h = 5;
		int a = sc.nextInt();
		int b = 1;
		for (int i = 1; i <= h; i++) {
			do {
				if (a--<=0) {
				}else if ((a % 2 == 0)) {
					System.out.print("***");
					b=b+1;

				} else {
					System.out.print("+++");

				}
				

			} while (b<= a);
			System.out.println();	
		}
		
		
		sc.close();
	}

}
