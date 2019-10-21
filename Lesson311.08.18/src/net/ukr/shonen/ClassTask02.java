package net.ukr.shonen;

import java.util.Arrays;

public class ClassTask02 {
	public static void main(String[] args) {
		int[]a = new int[] {5,9,2,4};
		
		System.out.println(Arrays.toString(a));
		
		int[]b = Arrays.copyOfRange(a, 1, 4);
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
	}
	
}
