package net.ukr.shonen;

public class Cat {
	private String name;
	private double weight;
	private int age;
	private String color;
	private int numberOfCat;

	public Cat(String name, double weight, int age, String color, int numberOfCat) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.color = color;
		this.numberOfCat = numberOfCat;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfCat() {
		return numberOfCat;
	}

	public void setNumberOfCat(int numberOfCat) {
		this.numberOfCat = numberOfCat;
	}

	public void getVois() {
		System.out.println("Meow");
	}

	public void goEat() {
		System.out.println("Cats go eat");
	}

	public void goSleep() {
		System.out.println("You don't see any cats, maybe they are sleep");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", weight=" + weight + ", age=" + age + ", color=" + color + ", numberOfCat="
				+ numberOfCat + "]";
	}

}
