package com.section03;

// String 클래스 예시
public class Ex10_06 {

	public static void main(String[] args) {
		String str1 = "www.naver.com";
		String[] arrStr1 = str1.split("\\."); // . 에서 잘라서 반환
		
		for(int i =0; i < arrStr1.length; i++) { // 배열의 length 는 속성 이라 () 없어도됨
			System.out.println(arrStr1[i]);
		}
		
		System.out.println();
		
		String str2 = "Java";
		System.out.println(str2);
		System.out.println(str2.toUpperCase()); // 모두 대문자
		System.out.println(str2.toLowerCase()); // 모두 소문자
		
		for(int i =0; i < str2.length(); i ++) { // 배열 아닌 곳의 length 는 함수라 () 필요
			System.out.println(str2.charAt(i)+ " . "); // 한글자씩 잘라서 뒤에 . 붙혀서 출력
		}
		
		String str3 = str2.replace('a', 't'); // 모든 a 글자 t로 바꿈
		System.out.println("\n" + str3);
		
		
		String str4 = "I like to eat ice cream.";
		System.out.println(str4.substring(14).toUpperCase()); 
		// 인덱스 14 위치 부터 출력 (인덱스는 0 부터임)
		System.out.println(str4.indexOf("ice")); // ice 단어 시작 위치 반환 -> 인덱스 14부터 시작
		System.out.println(str4.indexOf("dog")); // 없는 글자라 -1 반환함 
	}
}
