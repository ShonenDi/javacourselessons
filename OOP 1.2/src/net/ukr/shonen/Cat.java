package net.ukr.shonen;

public class Cat extends Animals {

	private String neme;
	private String type;

	public Cat(int age, double weigt, boolean sex, String ration, String neme, String type) {
		super(age, weigt, sex, ration);
		this.neme = neme;
		this.type = type;
	}

	public Cat() {
		super();
	}

	public String getNeme() {
		return neme;
	}

	public void setNeme(String neme) {
		this.neme = neme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void getVoice() {
		System.out.println("Meow");

	}

	@Override
	public String toString() {
		return "Cat [neme=" + neme + ", type=" + type + ", " + super.toString();
	}
}
