package net.ukr.shonen;

import java.util.Scanner;

public class MainApartmens {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number flat ");
		int a = sc.nextInt(); // nunber flat
		int b; // floor
		int c; // entrence
		if (a>0&&a<145) {
		if (a / 36 == 0 || a % 36 != 0) {
			c = (a / 36) + 1;
		} else {
			c = (a / 36);
		}
		if (a % 4 == 0) {
			b = (a - (36 * (c - 1))) / 4;
		} else {
			b = (a - (36 * (c - 1))) / 4 + 1;
		}

		System.out.println("Квартира " + a + " находится на " + b + " этаже " + "в " + c + " подъезде");
		}else {
		
			System.out.println("Такой квартиры нет");
		}
        sc.close();
        
	}

}
