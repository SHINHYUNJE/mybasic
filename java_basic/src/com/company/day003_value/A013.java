package com.company.day003_value;

import java.util.Scanner;

public class A013 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 가비지콜렉터
		
		int number1 = 0, number2 = 0, total = 0;
		
		System.out.print("숫자 1 입력 > ");
		number1 = scanner.nextInt();
		System.out.print("숫자 2 입력 > ");
		number2 = scanner.nextInt();
		total = number1 + number2;
		System.out.printf("%d + %d = %d ", number1, number2, total);
//		scanner.close(); -  가비지콜렉터가 자동으로 닫아줌
	}

}
