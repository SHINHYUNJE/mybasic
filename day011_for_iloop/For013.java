package com.company.day011_for_iloop;

import java.util.Scanner;

public class For013 {

	public static void main(String[] args) {
		// 1. 예상되는 결과 --> 5부터 안나옴, for 빠져나오기
		char loop = ' ', loop2 = ' ';

		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 11; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + "\t");
		}
		System.out.println();
		// 2. 예상되는 결과 --> 1 2 3 4 5skip 6 7 8 9 10
		for (int i = 1; i < 11; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + "\t");
		}
		System.out.println();
		// 3. 무한반복 for (;;) {빠져나오기}
		for (;;) { // 3-1. for(;;) 무한반복
			System.out.println("Hello :)");
			// 3-2. 빠져나올 장치
			System.out.println("계속 인사할래요 O/X");
			loop = scanner.next().charAt(0);
			if (loop == 'X') {
				break;
			}
		}
		for (; loop2 != 'X';) {
			System.out.println("Hello :)");
			// 3-2. 빠져나올 장치
			System.out.println("계속 인사할래요 O/X");
			loop2 = scanner.next().charAt(0);
		}
		System.out.println();
		// Q1. 1을 입력할때까지 무한반복
		int num = -1;
		for (; num != 1;) {
			System.out.println("1을 입력하시오. > ");
			num = scanner.nextInt();
			System.out.println("입력한 숫자는 " + num + "입니다");
		}
	}

}
