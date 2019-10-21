package net.ukr.shonen;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Group implements Voenkom {

	private Student[] group = new Student[10];
	private int nuberOfGroup;

	public Group(Student[] group, int nuberOfGroup) {
		super();
		this.group = group;
		this.nuberOfGroup = nuberOfGroup;
	}

	public Group() {
		super();
	}

	public int getNuberOfGroup() {
		return nuberOfGroup;
	}

	public void setNuberOfGroup(int nuberOfGroup) {
		this.nuberOfGroup = nuberOfGroup;
	}

//	public void addStudInter() throws MyArrayOverflowExeption{
//		
//	}

	public void addStudent(Student noob) throws MyArrayOverflowExeption {
		if (noob == null) {
			throw new IllegalArgumentException("null");
		}
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = noob;
				return;

			}
		}
		throw new MyArrayOverflowExeption();

	}

	public void delStudent(String surname) {

		for (int i = 0; i < group.length; i++) {

			if (group[i] != null && group[i].getSurname().equalsIgnoreCase(surname)) {
				group[i] = null;
				System.out.println("Student " + surname + " was delete");
				return;
			}
		}
		System.out.println("Student not exist");

	}

	public Student search(String surname) {
		for (Student noob : group) {
			if (noob != null && noob.getSurname().equalsIgnoreCase(surname)) {
				return noob;
			}
		}
		return null;
	}

	public void addStudInter() throws NegativeValueException {

		String surname = String.valueOf(JOptionPane.showInputDialog("Enter student's surname", "Student surname"));
		String name = String.valueOf(JOptionPane.showInputDialog("Enter student's name", "Student name"));
		String patronymic = String
				.valueOf(JOptionPane.showInputDialog("Enter student's patronymic", "Student patronymic"));
		String sex = String.valueOf(JOptionPane.showInputDialog("Enter student's gender", "Male/Female"));
		int age = Integer.valueOf(JOptionPane.showInputDialog("Enter student's age", "Student's age"));
		int course = Integer.valueOf(JOptionPane.showInputDialog("Enter student's course", "Student's course"));
		int nuberOfGroup = Integer.valueOf(JOptionPane.showInputDialog("Enter nuber of group", "Nuber of group"));
		int numberOfRecBook = Integer.valueOf(JOptionPane.showInputDialog("Enter nuber of book", "Nuber of book"));

		Student noob = new Student(surname, name, patronymic, sex, age, course, nuberOfGroup, numberOfRecBook);

		try {
			addStudent(noob);

		} catch (MyArrayOverflowExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Canceled");
		}

	}

	public void groupList() {
		for (int i = 0; i < group.length; i++) {
			System.out.println((i + 1) + ")" + group[i]);
		}
	}

	@SuppressWarnings("unchecked")
	public void SortByParam() throws NegativeValueException {
		StringBuilder sb = new StringBuilder();
		sb.append("Choose your parameter to sort" + "\r\n");
		sb.append("1 - Surname" + "\r\n");
		sb.append("2 - Name" + "\r\n");
		sb.append("3 - Patronymic" + "\r\n");
		sb.append("4 - Gender Male/Female" + "\r\n");
		sb.append("5 - Age" + "\r\n");
		sb.append("6 - NumberOfRecBook" + "\r\n");
		int choose = Integer.valueOf(JOptionPane.showInputDialog(sb.toString()));
		StringBuilder sb1 = new StringBuilder();
		sb1.append("1 - to choose acending sort" + "\r\n");
		sb1.append("2 - to decreasing order sort" + "\r\n");
		int nextChoose = Integer.valueOf(JOptionPane.showInputDialog(sb1.toString()));
		boolean forvard;

		if (nextChoose == 1) {
			forvard = true;
		} else
			forvard = false;
		try {
			Arrays.sort(group, new SortStud(choose, forvard));
		} catch (NumberFormatException e) {
		} catch (InvalidParameterException e) {
			System.out.println("Wrong value of parameter");
		}
	}

	@Override
	public String toString() {
		return "Group [group=" + this.nuberOfGroup + Arrays.toString(group) + "]";
	}

	@Override
	public Student[] prizovnik() {
		int n = 0;
		for (Student noob : group) {
			if (noob != null && noob.getSex().equalsIgnoreCase("Male") && noob.getAge() >= 18) {
				n++;
			}
		}
		int i = 0;
		Student[] prizovnik = new Student[n];
		for (Student noob : this.group) {
			if (noob != null && noob.getSex().equalsIgnoreCase("Male") && noob.getAge() >= 18) {
				prizovnik[i++] = noob;
			}
		}
		return prizovnik;
	}
}
