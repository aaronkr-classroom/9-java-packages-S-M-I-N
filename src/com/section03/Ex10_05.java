package com.section03;

// Math 클래스 예시
public class Ex10_05 {

	public static void main(String[] args) {
		System.out.println(Math.abs(-10)); // 절댓값 반환
		System.out.println(Math.sqrt(9.0)); // 제곱근 반환 -> 3
		System.out.println(Math.pow(5, 3)); // 5제곱3
		System.out.println(Math.PI); // PI는 대문자로
		System.out.println(Math.E); // 지수 E 도 대문자로

		System.out.println(Math.round(4.5)); // 반올림 함수 (반올림(내림)해서 정수로 반환) (.5부터 올림)
		System.out.println(Math.ceil(4.1)); // 올림 함수
		System.out.println(Math.floor(4.9)); // 내림 함수
		System.out.println(Math.max(5, 100));
		System.out.println(Math.min(5,100));
		System.out.println(Math.random()); // 난수 출력 (0 ~ 1사이)
		
		// 1부터 100까지 난수 정수 선택하기
		System.out.println(Math.round(Math.random()*100)); // 1~100 난수 (Math.round)
		System.out.println(Math.random()*100); // 0 ~ 100 난수
	}

}
