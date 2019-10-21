package com.net.shonen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.println("INPUT DATE");
		day = sc.nextInt();

		if (0 < day && day < 32) {
			switch (day % 7) {
			case 1:
				System.out.println("Понедельник");
				break;
			case 2:
				System.out.println("Вторник");
				break;
			case 3:

				System.out.println("Среда");
				break;
			case 4:
				System.out.println("Четверг");
				break;
			case 5:

				System.out.println("Пяница");
				break;
			case 6:
				System.out.println("Суббота");
				break;
			case 0:

				System.out.println("Воскресенье");
				break;
			}
		} else {
			System.out.println("wrong data");
		}

	}

}
