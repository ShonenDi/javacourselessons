package net.ukr.shonen;

import java.util.Scanner;

public class circumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите r радиус окружности в см");
		double r = in.nextDouble();
		double c = 2 * Math.PI * r;
		System.out.println("ƒлина окружности " + c + " см");
		in.close();

	}

}
