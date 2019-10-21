package net.ukr.shonen;

public class Human {

	private String surname;
	private String name;
	private String patronymic;
	private String sex;
	private int age;

	public Human(String surname, String name, String patronymic, String sex, int age) {
		super();
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.sex = sex;
		this.age = age;
	}

	public Human() {
		super();
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void humanInfo() {
		System.out.println(this.name + " " + this.patronymic + " " + this.surname + " Sex: " + this.sex + " Age: " + this.age);
	}

	@Override
	public String toString() {
		return "Human [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", sex=" + sex + ", age="
				+ age + "]";
	}

}
