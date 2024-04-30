package com.section03;

public class Ex10_09 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		Integer a2 = 100;
		Integer b2 = 200;
		
		System.out.println("a : " + a + "\t b : " + b + "\n");
		System.out.println("a2 : " + a2 + "\t b2 : " + b2 + "\n");
		
		String val1 = a2.toString(); // a는 toString() 못씀.
		String val2 = Integer.toString(b2);
		
		System.out.println("a2.toString() : " + val1);
		System.out.println("Integer.toString(b2) : " + val2);
	}

}
