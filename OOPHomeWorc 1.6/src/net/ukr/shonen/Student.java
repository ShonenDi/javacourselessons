package net.ukr.shonen;

public class Student extends Human {
	private int course;
	private int group;
	private int numberOfRecBook;

	public Student(String surname, String name, String patronymic, String sex, int age, int course, int group,
			int numberOfRecBook) {
		super(surname, name, patronymic, sex, age);
		this.course = course;
		this.group = group;
		this.numberOfRecBook = numberOfRecBook;
	}

	public Student() {
		super();
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getNumberOfRecBook() {
		return numberOfRecBook;
	}

	public void setNumberOfRecBook(int numberOfRecBook) {
		this.numberOfRecBook = numberOfRecBook;

	}

	@Override
	public void humanInfo() {
		System.out.println("Group: " + this.group + " Course: " + this.course + " RecBook: " + this.numberOfRecBook);
		super.humanInfo();
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", group=" + group + ", numberOfRecBook=" + numberOfRecBook + "]";
	}

}
