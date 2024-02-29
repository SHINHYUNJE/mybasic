package com.company.day003_value;

import java.util.Scanner;

public class A016 {
	public static void main(String[] args) {

		int kor,eng,math = 0;
		double sum,avg = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("국어점수 입력 > ");
		kor = scanner.nextInt();
		System.out.print("영어점수 입력 > ");
		eng = scanner.nextInt();
		System.out.print("수학점수 입력 > ");
		math = scanner.nextInt();

		sum = kor + eng + math;
		avg = sum / 3;
		System.out.printf("총점 : %.1f \n", sum);
		System.out.println("평균 : " + avg);

	}

}
