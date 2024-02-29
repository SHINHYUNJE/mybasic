package com.company.day005;

import java.util.Scanner;

public class A023 {
	public static void main(String[] args) {
		// #1. 문자초기화
		char ch1 = ' ';
		char ch = '\u0000';
		ch = 'A'; // 저장시에는 숫자/ 출력은 문자
		System.out.println(ch);
		System.out.println((int) ch);

		// #2. 문자의 연산
		System.out.println(ch++);
		// A++ , 문자1개증가 = B
		System.out.println(ch + 1); // 66
		// ch + 1
		// 'A' + 1
		// 'A'(char) + 1(int)
		// 'A'(int:65) + 1(int) 의 결과물은 int
		System.out.println((char) (ch + 1));
		System.out.println(ch);

		// #3. 문자 - Scanner로 입력한거
		Scanner scanner = new Scanner(System.in);
		// why? char c - scanner.nextChar(); //X
		String str = "abc"; // str[1000번지] <-1000번지 ["abc"]
		str = "ab"; // str[2000번지] <-2000번지 ["abc"]
		str = "a";
		str = "";
		str = "abcd";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));

		System.out.print("문자열(String) 입력 > ");
		str = scanner.next();
		System.out.println("입력한 문자열 : " + str);

		System.out.print("문자(char) 입력 > ");
		char c = scanner.next().charAt(0);
		System.out.println("입력한 문자 : " + c);

	}

}
