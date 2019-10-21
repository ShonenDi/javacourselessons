package net.ukr.shonen;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner size = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = size.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter array number");
			arr[i] = size.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		System.out.println("Enter the element what you need to search");
		int a = size.nextInt();
		size.close();
		System.out.println(searchElem(arr, a));
	}

	/**
	 * Return index of searching element for array of integer
	 * 
	 * @author Shonen
	 * 
	 * @param a The array of integer <code>int</code>
	 * @param t The <code>int</code> element for searching
	 * @return The <code>int</code> index of searching element
	 */
	public static int searchElem(int[] a, int t) {
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == t) {
				b  = i;
			}
		}
		return b;
	}
}
