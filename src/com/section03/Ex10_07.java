package com.section03;

public class Ex10_07 {

	// StringBuffer 클래스 사용
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello ");
		
		str.append("Programming"); // append -> 추가 (StringBuffer로 써야함) //뒤에 문자열 추가
		System.out.println(str);
		
		str.insert(6, "Java "); // 삽입 -> 6번째에 문자열 삽입
		System.out.println(str);
		
		
		str.replace(1, 4, "Good"); // 대체 -> 1~4전까지 삭제 후 Good 으로 대체
		System.out.println(str);
		
		str.delete(1, 5); // 삭제 -> 1~5전까지 삭제
		System.out.println(str);
		
		str.reverse(); // 문자열 거꾸로 출력
		System.out.println(str);
		
	}

}
