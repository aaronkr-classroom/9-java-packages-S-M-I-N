package com.section04;

import java.util.Date;

public class Ex10_10 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		long ms = System.currentTimeMillis(); //밀리타임 -> 1970.1.1 0:00 부터 시작함 -> ms : 0
		System.out.println("현재 ms : " + ms);
		
		Date d2 = new Date(ms);
		System.out.println(d2);
		
		// My
		Date this_bday = new Date(2024, 04, 30);
		Date my_bday = new Date(2000,03,06);
		
		boolean after = this_bday.after(my_bday);
		boolean before = this_bday.before(my_bday);
		
		System.out.println(this_bday);
		System.out.println("after : " + after);
		System.out.println("before : " + before);
		
	}

}
