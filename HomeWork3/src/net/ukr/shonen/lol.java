package net.ukr.shonen;

import java.util.Scanner;

public class lol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter, num, item, array[];
	      
	      //объект дл€ считывани€ чисел, введенных пользователем в консоль
	      Scanner input = new Scanner(System.in);
	      System.out.println("¬ведите размер массива: ");
	      num = input.nextInt();
	 
	      // создаем пустой массив, определенного выше размера
	      array = new int[num]; 
	 
	      // просим пользовател€ заполнить массив, ввод€ элементы в консоль
	      System.out.println("¬ведите " + num + " чисел");
	      
	      // цикл по размеру массива - вводим числа в консоль
	      for (counter = 0; counter < num; counter++) {
	        array[counter] = input.nextInt();
	      }
	      System.out.println("¬ведите число, которое надо найти: ");
	      item = input.nextInt();
	 
	      for (counter = 0; counter < num; counter++) {
	         if (array[counter] == item) {
	           System.out.println(item + " €вл€етс€ " + (counter+1) + " по счету в массиве");
	           // „исло найдено, следовательно прекращаем поиск
	           // вызовом оператора break
	           break;
	         }
	      }
	      if (counter == num) {
	        System.out.println("„исло " + item + " не найдено в массиве");
	      }
	   }

	}


