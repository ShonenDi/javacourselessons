package net.ukr.shonen;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������� ������������ a, b, c");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if ((a+b>c)&&(b+c>a)&&(c+a>b)) {
			System.out.println("����������� ����������");
		}else {
			System.out.println("����������� �� ����������");
		}
		sc.close();

	}

}
