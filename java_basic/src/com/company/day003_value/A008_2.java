package com.company.day003_value;

public class A008_2 {
	public static void main(String[] args) {
		// #4 char
		/*
		 * 저장시 : 문자, 숫자, 유니코드 입력 -> 유니코드표 -> 메모리저장[정수] 출력시 : 메모리에 저장된 정수값 -> 유니코드표 ->
		 * [문자]
		 */
		// #4-1. 문자
		char ch1 = 'A', ch2 = '가', ch3 = '0';
		System.out.println(ch1 + "\t" + ch2 + "\t" + ch3);
		// #4-2. 숫자
		char ch4 = 65, ch5 = 0xac00, ch6 = 48;
		System.out.println(ch4 + "\t" + ch5 + "\t" + ch6);
		// #4-3. 유니코드
		char ch7 = '\u0041', ch8 = '\uac00', ch9 = '\u0030';
		System.out.println(ch7 + "\t" + ch8 + "\t" + ch9);
		System.out.println((int)ch7 + "\t" + (int)ch8 + "\t" + (int)ch9);
		
		//#5. 참조형 - 문자열
		String str = "ABC"; // char ch1 ='A';
                            // str[1000번지] <---1000번지 "ABC"
		System.out.println(str);

	}

}
