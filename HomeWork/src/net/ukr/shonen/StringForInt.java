package net.ukr.shonen;

import java.util.Random;

public class StringForInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(5);
			System.out.print("" + arr[i]);
		}
		System.out.println();
		System.out.println(ToStringInt(arr));

	}

	/**
	 * Method return array of integer ign string using StringBuilder
	 * 
	 * @param a <code> int </code> value of array
	 * @return strin
	 */
	public static String ToStringInt(int[] a) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append("String value is " + a[i] + "\n");
		}
		String s = "";
		s += sb;

		return s;

	}

}
