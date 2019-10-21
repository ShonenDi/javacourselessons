package net.ukr.shonen;

import java.util.Calendar;
import java.util.Date;

public class ToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		Date dateOne = new Date();
		long presentMonth = dateOne.getTime();
		cl.add(Calendar.MONTH, -1);
		Date dateTwo = cl.getTime();
		long minusMonth = dateTwo.getTime();
		System.out.println(presentMonth - minusMonth);

	}
}
