package net.ukr.shonen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdfOne = new SimpleDateFormat("dd MMMM yyyy");
		SimpleDateFormat sdfTwo = new SimpleDateFormat("dd/MM/yyyy");
		
		String myBirthDay = "21/11/1988";
		
		try {
			date = sdfTwo.parse(myBirthDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String result = sdfOne.format(date);
		
		System.out.println(result);
		
		System.out.println(date.getTime());

	}

}
