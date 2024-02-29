package com.company.day003_value;

import java.util.Scanner;

public class A012 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int nowYear = 0;
		
		System.out.println("올해 년도를 입력해주세요>");
		
		nowYear = scanner.nextInt();
		
		System.out.println("올해 년도는 "+nowYear+"년 입니다.");
	}

}
