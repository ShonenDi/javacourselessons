package net.ukr.shonen;

import java.util.Arrays;
import java.util.Random;

public class LessonTask01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();

		int[] money = new int[12];

		for (int i = 0; i < money.length; i++) {
			money[i] = 15000 + rn.nextInt(15000);
		}
		
		System.out.println(Arrays.toString(money));

		int totalSumm = 0;
		for (int i = 0; i < money.length; i++) {
			totalSumm = totalSumm + money[i];

		}
		System.out.println("Total sum = " + totalSumm);

		System.out.println("Avarage = " + totalSumm / money.length);
	}

}
