package net.ukr.shonen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class ArraysToText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arry = new int[2][2];
		arry[0][0] = 1;
		arry[0][1] = 3;
		arry[1][0] = 8;
		arry[1][1] = 4;
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry.length; j++) {
				System.out.print(arry[i][j] + " ");
			}
			System.out.println();
		}
		ArryasToSringNow(arry);
	}

	public static void ArryasToSringNow(int[][] a) {
		try {
			PrintWriter pw = new PrintWriter("Array.txt");{
				for (int i = 0; i < a.length; i++) {
					pw.write(Arrays.toString(a));
				}
				pw.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
		
	}
	}


