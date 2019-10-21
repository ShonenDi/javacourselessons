package net.ukr.shonen;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Itput number year");
		int a= sc.nextInt();
		if(a>0) {
		if (a%4!=0||(a%100==0&&a%400!=0)) {
			System.out.println("This year is not leap year");
		}else {
			System.out.println("This year is  a leap year");
		}
		
		}else {
			System.out.println("Year does not exist");
		}
		
		sc.close();
	

	}

}
