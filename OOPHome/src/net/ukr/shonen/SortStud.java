package net.ukr.shonen;

import java.security.InvalidParameterException;
import java.util.Comparator;

public class SortStud implements Comparator {

	int param;
	boolean forvard = true;

	public SortStud(int param, boolean forvard) {
		super();
		this.param = param;
		this.forvard = forvard;
	}

	public SortStud() {
		super();
	}

	public int compare(Object a, Object b) {
		Student one = (Student) a;
		Student two = (Student) b;
		int n;
		if (this.forvard) {
			n = 1;
		}else {
			n=-1;
		}

		if (a != null && b == null) {
			return -1;
		}
		if (a == null && b != null) {
			return 1;
		}
		if (a == null && b == null) {
			return 0;
		}

		if (param == 1) {
			return (one.getSurname()).compareToIgnoreCase(two.getSurname()) * n;
		}

		if (param == 2) {
			return (one.getName()).compareToIgnoreCase(two.getName()) * n;
		}
		if (param == 3) {
			return (one.getPatronymic()).compareToIgnoreCase(two.getName()) * n;
		}
		if (param == 4) {
			return (one.getSex()).compareToIgnoreCase(two.getSex()) * n;
		}

		if (param == 5) {
			if (one.getAge() > two.getAge()) {
				return 1 * n;
			}

			if (one.getAge() < two.getAge()) {
				return -1 * n;
			}

			return 0;
		}

		if (param == 6) {
			if (one.getNumberOfRecBook() > two.getNumberOfRecBook()) {
				return 1 * n;
			}

			if (one.getNumberOfRecBook() < two.getNumberOfRecBook()) {
				return -1 * n;
			}

			return 0;
		}

		throw new InvalidParameterException();
	}

}
