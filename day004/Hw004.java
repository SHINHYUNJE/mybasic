package com.company.day004;

import java.util.Scanner;

public class Hw004 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		float result = 0.0f;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자1 입력> ");
		num1 = scanner.nextInt();
		System.out.print("숫자1 입력> ");
		num2 = scanner.nextInt();
		result = (float)num1/num2;
		System.out.printf("%d / %d = %.3f",num1,num2,result);

	}


}
