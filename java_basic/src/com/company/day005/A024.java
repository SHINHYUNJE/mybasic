package com.company.day005;

import java.util.Scanner;

public class A024 {
	public static void main(String[] args) {
		String str = "";
		Scanner scanner = new Scanner(System.in);

		System.out.print("1. abc를 입력해주세요.  ");
		str = scanner.next(); //-nextln 알아보기
		System.out.println("입력한 값 > " + str);
		System.out.println("첫번째 문자 > " + str.charAt(0));
		System.out.println("두번째 문자 > " + str.charAt(1));
		System.out.println("세번째 문자 > " + str.charAt(2));

		System.out.print("2. 타입을 선택해주세요! (A/B) ");
		char c = scanner.next().charAt(0);
		System.out.println(c + " 타입");

	}

}
