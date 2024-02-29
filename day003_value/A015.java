package com.company.day003_value;

import java.util.Scanner;

public class A015 {
	public static void main(String[] args) {
		
		float pie = 0f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("pie 값은 얼마입니까? > ");
		pie = scanner.nextFloat();
		System.out.printf("pie 값은 %f 입니다.", pie);
	}

}
