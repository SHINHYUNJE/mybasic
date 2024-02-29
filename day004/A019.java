package com.company.day004;

import java.util.Scanner;

public class A019 {
	public static void main(String[] args) {
		int enum1 = 0, enum2 = 0;
		float result = 0.0f;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 1 입력 > ");
		enum1 = scanner.nextInt();
		System.out.print("숫자 2 입력 > ");
		enum2 = scanner.nextInt();
		result = (float)enum1 / enum2; // 정수 / 정수 = 정수,  실수 / 정수 = 실수
		
		String resultS = String.format("%.3f",result);
		
		System.out.println(enum1 + " / " + enum2 +" = "+ resultS);
		System.out.printf("%d / %d = %.3f", enum1, enum2, result);
		//소수점 셋째자리까지
	}

}
