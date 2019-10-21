package net.ukr.shonen;

import java.util.Arrays;
import java.util.Random;

public class RandomArrays {

	public static void main(String[] args) {
		Random rn = new Random();
		int[] a = new int[15];
		int[] b = new int[30];
		for (int i = 1; i < a.length; i++) {
			a[i] = rn.nextInt(15);
			System.arraycopy(a, 0, b, 0, 15);
			b[i + 15] = a[i] * 2;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
