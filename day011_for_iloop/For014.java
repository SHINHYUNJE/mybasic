package com.company.day011_for_iloop;

import java.util.Scanner;

public class For014 {
	public static void main(String[] args) {
		float pie = 0.0f;
		String result = "다시도전";
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			System.out.print("PI값은 얼마입니까? > ");
			pie = scanner.nextFloat();
			if (pie == 3.14f) {
				result = "정답";
				System.out.println(result);
				break;
			} else {
				System.out.println(result);
			}
		}

	}

}
