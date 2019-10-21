package net.ukr.shonen;



public class Student extends Human   {
	private int course;
	private int nuberOfGroup;
	private int numberOfRecBook;


	public Student(String surname, String name, String patronymic, String sex, int age, int course, int nuberOfGroup,
			int numberOfRecBook) {
		super(surname, name, patronymic, sex, age);
		this.course = course;
		this.nuberOfGroup = nuberOfGroup;
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

	public int getNuberOfGroup() {
		return nuberOfGroup;
	}

	public void setNuberOfGroup(int nuberOfGroup) {
		this.nuberOfGroup = nuberOfGroup;
	}

	public int getNumberOfRecBook() {
		return numberOfRecBook;
	}

	public void setNumberOfRecBook(int numberOfRecBook) {
		this.numberOfRecBook = numberOfRecBook;
	}
	
		

	@Override
	public String toString() {
		return "Student " + super.toString()+"[course=" + course + ", group=" + nuberOfGroup + ", numberOfRecBook=" + numberOfRecBook + "]";
	}

}
	

