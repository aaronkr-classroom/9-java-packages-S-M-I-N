package com.section04;

import java.util.Calendar;
import java.util.Locale;
import static java.util.Calendar.*;
import java.util.Date;

public class Ex10_11 {
	public static int getDiffYears(Date first, Date last) { //시간 차 구하기
		Calendar a = getCalendar(first);
		Calendar b = getCalendar(last);
		int diff = b.get(YEAR) - a.get(YEAR);
		
		if(a.get(MONTH) > b.get(MONTH) || 
		(a.get(MONTH) == b.get(MONTH) &&
		a.get(DATE) > b.get(DATE))) {
			diff--;
		}
		return diff;
	}
	
	public static Calendar getCalendar(Date date) {
		Calendar cal = Calendar.getInstance(Locale.KOREA);
		cal.setTime(date);
		return cal;
	}

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.print("현재 날짜 : ");
		System.out.print(cal.get(Calendar.YEAR) + "년");
		System.out.print(cal.get(Calendar.MONTH)+1 + "월"); // 0부터 시작임 -> +1 해줘야함
		System.out.print(cal.get(Calendar.DATE) + "일");
		
		Date my_bday = new Date(2000, 03, 06);
		Date today = new Date(2024, 04, 30); // 현재 시간
		
		System.out.println();
		System.out.println("나이 : " + getDiffYears(my_bday, today));
	}

}
