package net.ukr.shonen;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat(4, 7, true, "Milk", "Vaska", "Home");

		catOne.getVoice();
		System.out.println(catOne);

		Animals an = catOne;

		Animals[] zoo = new Animals[10];
		zoo[0] = catOne;
		
		an.getVoice();

	}

}
