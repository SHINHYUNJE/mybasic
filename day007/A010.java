package com.company.day007;

import java.util.Scanner;

public class A010 {
	public static void main(String[] args) {
//		숫자입력 받아서 절대값
//		GIGO
//		변수
		int a = 0, result1, result2 = 0;
		Scanner scanner = new Scanner(System.in);
//		입력
		System.out.print("숫자한개입력 > ");
		a = scanner.nextInt();
//		처리
//		음수라면 양수로 3 = (-3)*(-1)
//		(조건)? 양수변경 : 양수값
//		(음수라면)? 음수변경*1 : 양수값
		result1 = (a < 0) ? -a : a;
		result2 = (a < 0) ? ~a + 1 : a;
		System.out.println("ㅁ 입력한값 : " + a);
		System.out.println("ㅁ 절대값 : " + result1);
		System.out.println("ㅁ 절대값 : " + result2);

	}

}
