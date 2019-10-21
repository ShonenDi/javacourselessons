package net.ukr.shonen;

import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите любое п€тизначное число и нажмите Enter");
		int number = sc.nextInt();
		
		int num1 = number/10000;
		int num2 =number%10000/1000;
		int num3 =number%1000/100;
		int num4 =number%100/10;
		int num5 =number%10;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		sc.close();

	}

}
