package net.ukr.shonen;

public class MainZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 15, 6, 25, 9, 7, 84 };
		int num = 9;

		System.out.println(search(array, num));
	}

	
	/**
	 * ����� ����� � �������. ���� ����� ������� - ���������� ��� ������. ���� ����� ��� - ���������� -1.
	 * @param a - ������
	 * @param b - ������� �����
	 * @return - ���������
	 */
	public static int search(int[] a, int b) {
		int c = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				c = i;
			}
		}
		return c;
	}
}


