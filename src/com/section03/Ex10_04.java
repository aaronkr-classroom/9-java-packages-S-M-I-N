package com.section03;

import com.javamaster.mypackage.*;

// object 클래스 예시
public class Ex10_04 {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		System.out.println(cat1.toString()); // Cat 뒤에 메모리 객체
		System.out.println(cat2.toString()); 
		System.out.println(cat1.equals(cat2)); //같은 객체면 true 반환 -> 다른 객체라 false 반환
		
		cat1 = cat2;
		System.out.println(cat1.equals(cat2)); //같은 객체로 만들어서 true 반환
		
		System.out.println(cat1.toString()); // Cat 뒤에 메모리가 같이 나옴. -> 위에서 같다고 재정의 해줘서
		System.out.println(cat2.toString());
		
		System.out.println();
		
		//String
		String str1 = cat1.scratch();
		String str2 = cat2.meow();
		String str3 = cat2.scratch();
		
		System.out.println(str1.equals(str2)); // false -> 문자열이 달라서
		System.out.println(str1.equals(str3)); // true -> 문자열이 같아서
	}

}
