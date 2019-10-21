package net.ukr.shonen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat randomCat = new Cat();
		Scanner sc = new Scanner(System.in);
		Cat catOne = new Cat("Pushok", 5, 2, "White", 1);

		Cat catTwo = new Cat();
		catTwo.setName("Semen");
		catTwo.setWeight(4.1);
		catTwo.setAge(4);
		catTwo.setColor("Gray");
		catTwo.setNumberOfCat(2);

		Cat catThree = new Cat("Myrchik", 3, 3, "Black", 3);

		System.out.println(catOne);
		System.out.println(catTwo);
		System.out.println(catThree);
		hungryCats();

		System.out.println("How many cats do you see?");
		int num = sc.nextInt();
		if (num == 1 || num == 2 || num == 3) {
			System.out.println("You are see " + num + " cats");
		} else {
			randomCat.goSleep();
		}
		sc.close();
	}

	/**
	 * this method ask you about hungry cats)))
	 * 
	 * @author Shonen
	 * 
	 *         if cats hungry <code> String </code> = "yes" method called new method
	 *         <code> getVoise </code> from class <code> Cat </code>
	 * 
	 *         if <code> getVoise </code> true called method <code> goEat</code>
	 *         from class <code> Cat </code>
	 * 
	 */
	public static void hungryCats() {
		Cat allCat = new Cat();
		Scanner sc = new Scanner(System.in);
		System.out.println("Are your cats hungry? yes/no");
		String s = sc.nextLine();

		boolean hungry = (s.equalsIgnoreCase("yes"));
		if (hungry) {
			allCat.getVois();
			System.out.println("Do you want to feed cats? yes/no");
			String s1 = sc.nextLine();
			boolean feed = (s1.equalsIgnoreCase("yes"));
			if (feed) {
				allCat.goEat();
			} else {
			}
		} else {
		}

	}

}
