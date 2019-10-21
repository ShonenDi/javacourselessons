package net.ukr.shonen;

import java.util.Scanner;

public class InputArray {

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
		size.close();
	}
	

}
