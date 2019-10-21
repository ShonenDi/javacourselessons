package net.ukr.shonen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxArrayNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int[] a = new int[size];

		Random rn = new Random();
		for (int i = 1; i < a.length; i++) {
			a[i] = rn.nextInt(size);
		}
		System.out.println(Arrays.toString(a));
		sc.close();
		maxArr(a);
	}
/**
 * 
 * @param c The  <code>int</code> value of array
 * @return The max <code>int</code> value of elements array
 */
	public static int maxArr(int[] c) {
		int b = c[0];
		for (int j = 1; j < c.length; j++) {
			if (c[j] > b) {
				b = c[j];
			}
		}
		System.out.println("Max number is " + b);
		return b;
	}

}