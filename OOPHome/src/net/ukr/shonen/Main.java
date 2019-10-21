package net.ukr.shonen;

public class Main {

	public static void main(String[] args) throws MyArrayOverflowExeption {
		// TODO Auto-generated method stub
		Student s1 = new Student("Arn", "Gdaf", "Brah", "Male", 18, 2, 212, 24585);
		Student s2 = new Student("Kidw", "Folc", "Trea", "Male", 23, 2, 212, 45466);
		Student s3 = new Student("Gfhgf", "SAFd", "Fet", "Femele", 19, 2, 212, 43223);
		Student s4 = new Student("Btds", "Cser", "Opjg", "Female", 19, 2, 212, 56211);
		Student s5 = new Student("Juyr", "Poin", "Notvas", "Male", 19, 2, 212, 56711);
		Student s6 = new Student("Hopff", "Zert", "Ytre", "Male", 19, 2, 212, 11233);
		Student s7 = new Student("Edrt", "MJyg", "Zniv", "Male", 19, 2, 212, 142411);
		Student s8 = new Student("Zaner", "Lifde", "Gftrw", "Female", 19, 2, 212, 78452);
		Student s9 = new Student("Vbbty", "Cerwq", "Asadc", "Male", 19, 2, 212, 9875);
		Student s10 = new Student("Gfhgf", "Juftew", "Fet", "Female", 19, 2, 212, 233124);
		Student s11 = new Student("Ubnv", "Dioncd", "Qfdsa", "Female", 19, 2, 212, 31227);

		Group first = new Group();
		first.setNuberOfGroup(212);
		try {
			first.addStudent(s1);
			first.addStudent(s2);
			first.addStudent(s3);
			first.addStudent(s4);
			first.addStudent(s5);
			first.addStudent(s6);
			first.addStudent(s7);
			first.addStudent(s8);
			first.addStudent(s9);
			first.addStudent(s10);
			first.addStudent(s11);
		} catch (MyArrayOverflowExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(first.search("edrt"));

		System.out.println();

		first.groupList();
		System.out.println();

		first.delStudent("Zaner");

		System.out.println();

		first.groupList();

		System.out.println();

		try {
			first.addStudInter();
		} catch (NegativeValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Canceled");
		}

		System.out.println();
		first.groupList();
		System.out.println();

		try {
			first.SortByParam();
		} catch (NegativeValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Canceled");
		}

		first.groupList();
		System.out.println();
		Student[] prizovniki = first.prizovnik();
		for	(Student noob:prizovniki ) {
			System.out.println("Can be a recrut "+noob);
		}
	}

}