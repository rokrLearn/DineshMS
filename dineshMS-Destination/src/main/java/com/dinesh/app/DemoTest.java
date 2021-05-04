package com.dinesh.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DemoTest {

	public static void main(String []args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy", Locale.ENGLISH);
		try {
			cal.setTime(sdf.parse("02-17-1998"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Calandar object ::");
		System.out.println(cal);
	}
}
