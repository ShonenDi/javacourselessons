package net.ukr.shonen;

import java.util.Scanner;

public class lol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter, num, item, array[];
	      
	      //������ ��� ���������� �����, ��������� ������������� � �������
	      Scanner input = new Scanner(System.in);
	      System.out.println("������� ������ �������: ");
	      num = input.nextInt();
	 
	      // ������� ������ ������, ������������� ���� �������
	      array = new int[num]; 
	 
	      // ������ ������������ ��������� ������, ����� �������� � �������
	      System.out.println("������� " + num + " �����");
	      
	      // ���� �� ������� ������� - ������ ����� � �������
	      for (counter = 0; counter < num; counter++) {
	        array[counter] = input.nextInt();
	      }
	      System.out.println("������� �����, ������� ���� �����: ");
	      item = input.nextInt();
	 
	      for (counter = 0; counter < num; counter++) {
	         if (array[counter] == item) {
	           System.out.println(item + " �������� " + (counter+1) + " �� ����� � �������");
	           // ����� �������, ������������� ���������� �����
	           // ������� ��������� break
	           break;
	         }
	      }
	      if (counter == num) {
	        System.out.println("����� " + item + " �� ������� � �������");
	      }
	   }

	}


