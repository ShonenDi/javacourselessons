package net.ukr.shonen;

import java.util.Scanner;

public class Maine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double price = 29;
		double fuel = 5.5;
		
		System.out.println("Input distace (km) and press enter");
		int way = sc.nextInt();

		double totalSum;

		totalSum = fuel / 100.0 * price * way * 2;

		System.out.println(totalSum + " UAH");

	}

}
